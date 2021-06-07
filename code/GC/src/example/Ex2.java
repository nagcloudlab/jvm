package example;

public class Ex2 {

	public static void main(String[] args) {

		try (Resource resource = new Resource()) {
			resource.init();
			resource.use();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
