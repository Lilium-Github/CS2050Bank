package program7;

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
		System.out.print("Account Number: ");
		System.out.println(accountNumber);
		System.out.print("Balance: ");
		System.out.println(balance);
	}
}

