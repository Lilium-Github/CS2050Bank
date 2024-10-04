package program6;

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
}
 