package program6;

import java.io.*;

public class Customer implements Serializable {
	private static final long serialVersionUID = 20L;
	private Account acc;
	private int customerID;
	private String name;
	
	public Customer(String inName, Account inAcc, int inCustomerID) {
		name = inName;
		acc = inAcc;
		customerID = inCustomerID;
	}
	
	public String getName() {
		return name;
	}
	
	public Account getAccount() {
		return acc;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void printData() {
		System.out.println(name);
		System.out.println(customerID);
		acc.printInfo();
	}
}
