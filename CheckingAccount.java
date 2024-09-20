// Abraham Maldonado
// CS 2050
// 9/24/2024

package program4;

public class CheckingAccount extends Account {
	public CheckingAccount(String firstName, String lastName, String ssn, String pass, double interest) {
		holderFirstName = firstName;
		holderLastName = lastName;
		holderSSN = ssn;
		holderPassword = pass;

		accountNumber = rand.nextInt(111111111, 1000000000); // random 9-digit account number
		
		balance = 0;
	}
	
	public void pay(double amt, Account recipient) {
		if(amt > 0) {
			balance -= amt;
			recipient.deposit(amt);
		}
	}
}
