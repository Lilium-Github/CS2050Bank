package program6;

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
}