package program7;

import java.io.*;

public class Customer implements Serializable {
	private static final long serialVersionUID = 20L;
	private Account acc;
	private int customerID;
	private String name;
	
	public Customer(String inName, int inCustomerID) {
		name = inName;
		customerID = inCustomerID;
		acc = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAccount(Account inAcc) {
		acc = inAcc;
	}
	
	public Account getAccount() {
		return acc;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void printData() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Customer ID: ");
		System.out.println(customerID);
		acc.printInfo();
	}
}
