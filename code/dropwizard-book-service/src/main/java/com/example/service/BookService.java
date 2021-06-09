package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.model.Book;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 * 
 */
public class BookService {

	static HashMap<Integer, Book> booksDB = getbooksDB();

	public BookService() {
		super();

		if (booksDB == null) {
			booksDB = new HashMap<Integer, Book>();
			// Creating some objects of Book while initializing
			Book javaBook = new Book(1, "Head first java", 400);
			Book springBook = new Book(4, "Spring in action", 500);
			Book pythonBook = new Book(3, "Learning Python", 250);
			Book hiberanteBook = new Book(2, "Hibernate in action", 300);

			booksDB.put(1, javaBook);
			booksDB.put(4, springBook);
			booksDB.put(3, pythonBook);
			booksDB.put(2, hiberanteBook);
		}
	}

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>(booksDB.values());
		return books;
	}

	public Book getBook(int id) {
		Book Book = booksDB.get(id);
		return Book;
	}

	public Book addBook(Book book) {
		book.setId(getMaxId() + 1);
		booksDB.put(book.getId(), book);
		return book;
	}

	public Book updateBook(Book book) {
		if (book.getId() <= 0)
			return null;
		booksDB.put(book.getId(), book);
		return book;

	}

	public void deleteBook(int id) {
		booksDB.remove(id);
	}

	public static HashMap<Integer, Book> getbooksDB() {
		return booksDB;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : booksDB.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}