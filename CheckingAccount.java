package program7;

public class CheckingAccount extends Account {
	private static final long serialVersionUID = 3L;
	
	public CheckingAccount(int accNum) {
		accountNumber = accNum;
		
		balance = 0;
	}
	
	public void pay(double amt, Account recipient) {
		if(amt > 0) {
			balance -= amt;
			recipient.deposit(amt);
		}
	}
	
	public void printInfo() {
		System.out.print("Checking Account Number: ");
		System.out.println(accountNumber);
		System.out.print("Balance: ");
		System.out.println(balance);
	}
}