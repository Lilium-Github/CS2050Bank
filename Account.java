// Abraham Maldonado
// CS 2050
// 9/24/2024

package program4;
import java.util.Random;

public class Account {
	protected String holderFirstName;
	protected String holderLastName;
	protected String holderPassword;
	protected String holderSSN;
	protected int accountNumber;
	protected double balance;
		
	Random rand = new Random();
	
	public String[] getName() {
		String[] name = {holderFirstName, holderLastName};
		return name;
	}
	
	
	public String getPassword() {
		return holderPassword;
	}
	
	public String getSSN() {
		return holderSSN;
	}
	
	public int getAccountNum() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setFirstName(String newFirstName) {
		holderFirstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		holderLastName = newLastName;
	}
	
	public void setPassword(String newPassword) {
		holderPassword = newPassword;
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
}
