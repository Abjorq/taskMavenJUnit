import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
	Book book2 = new Book(2,"Learning Java","Anton","","",0);
	bc.addBook(book2);

	assertEquals(2, bc.getNumberOfBooks());
	assertEquals(book2, bc.getBookArray()[1]);
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
	Book bookFound = bc.findBook("Learning Java");

	assertEquals(book1, bookFound);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
	Book bookFound = bc.findBook("learning java");

	assertEquals(book1, bookFound);
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
	Book bookFound = bc.findBook("   Learning Java   ");

	assertEquals(book1, bookFound);
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
