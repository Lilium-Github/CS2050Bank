package program6;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	protected int accountNumber;
	protected double balance;
	
	public int getAccountNum() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		if(amt > 0) {
			balance += amt;
		}
	}
	
	public void withdraw(double amt) {
		if(amt > 0) {
			balance -= amt;
		}
	}
	
	public void printInfo() {
		System.out.println(accountNumber);
		System.out.println(balance);
	}
}

