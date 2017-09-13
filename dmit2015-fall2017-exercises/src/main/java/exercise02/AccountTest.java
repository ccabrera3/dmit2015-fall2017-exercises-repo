package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAll() {
		Account currentAccount = new Account(1122, 100, "George");
		currentAccount.deposit(30, "from mom");
		currentAccount.deposit(40, "from girlfriend");
		currentAccount.deposit(50, "from ex gf");
		currentAccount.deposit(5, "donation to red cross");
		currentAccount.deposit(4, "coffee");
		currentAccount.deposit(2, "candy");
		//check the account holder name "george"
		assertEquals("George", currentAccount.getName());
		//check the interest rate is 1.5
		// check the balance is
		//check the number of transaction is 6
		//check all 3 withdraw transaction
		// check all 3 deposit transaction
	}

}
