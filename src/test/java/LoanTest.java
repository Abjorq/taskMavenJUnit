import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import models.Customer;
import models.Loan;
import org.junit.jupiter.api.Test;
import utilities.GenderType;
import utilities.LoanStatus;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {

		Customer customer = new Customer("Learning Java", "Anton", "Ante", "Gatan", "123","antonGmail",11, GenderType.MALE);
		Book book = new Book(1, "Learning Java","Anton","12345", "enBranch",200);
		Loan loan = new Loan(1, customer, book);

		LocalDate timesUp = LocalDate.now().plusDays(14);
		LocalDate dueDate = loan.getDueDate();

		assertEquals(timesUp, dueDate, "14 days from now its due date");

   }
}