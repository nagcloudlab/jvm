package com.example.resource;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

import com.example.model.Book;
import com.example.service.BookService;

@Path("api/books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

	BookService bookService = new BookService();

	ExecutorService executorService = Executors.newFixedThreadPool(50);

	@GET
	public List<Book> getBooks() throws InterruptedException {
		List<Book> listOfBooks = bookService.getAllBooks();
		TimeUnit.SECONDS.sleep(2);
		return listOfBooks;
	}

	@Path("/sync/{id}")
	@GET
	public Book getBookByIdSync(@PathParam(value = "id") int id) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Book book = bookService.getBook(id);
		return book;

	}

	@Path("/async/{id}")
	@GET
	public void getBookByIdAsync(@PathParam(value = "id") int id, @Suspended final AsyncResponse resp) {

		executorService.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Book book = bookService.getBook(id);
			resp.resume(book);
		});

	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Book addBook(Book book) {
		return bookService.addBook(book);
	}

	@Path("/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Book updateBook(@PathParam(value = "id") int id, Book book, @Suspended final AsyncResponse resp) {
		return bookService.updateBook(book);

	}

	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	@DELETE
	public void deleteBook(@PathParam(value = "id") int id) {
		bookService.deleteBook(id);
	}
}
