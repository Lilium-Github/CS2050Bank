package program7;

public class SavingsAccount extends Account {
	private static final long serialVersionUID = 2L;
	
	private double interestRate;

	public SavingsAccount(int accNum, double interest) {
		interestRate = interest;

		accountNumber = accNum; 
		
		balance = 0;
	}
	
	public void applyInterest() {
		balance += (balance * interestRate);
	}
	
	public void printInfo() {
		System.out.print("Savings Account Number: ");
		System.out.println(accountNumber);
		System.out.print("Balance: ");
		System.out.println(balance);
	}
}
 