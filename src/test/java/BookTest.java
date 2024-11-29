import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import org.junit.jupiter.api.Test;

class BookTest {


	//G
	@Test
	public void test2EqualBooks() {
		Book bookOne = new Book(1,"Learning Java","Anton","12345","enBranch",200);
		Book bookTwo = new Book(1,"Learning Java","Anton","12345","enBranch",200);
		assertEquals(bookOne, bookTwo, "These are the same books..");

	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book bookOne = new Book(1, "Learning Java", "Anton", "12345","enBranch", 200);
		Book bookTwo = new Book(2, "Tools", "Anton", "12456", "enNyBranch", 150);
		assertNotEquals(bookOne, bookTwo, "Two different books!");


	}

}
