package program6;

import java.io.*;

public class QueueNode implements Serializable {
	private static final long serialVersionUID = 99L;
	private Customer customer;
	private QueueNode next;
	
	public QueueNode(Customer inCustomer) {
		next = null;
		customer = inCustomer;
	}
	
	public Customer getData() {
		return customer;
	}
	
	public QueueNode getNext() {
		return next;
	}
	
	public void setNext(QueueNode inNext) {
		next = inNext;
	}
	
	public void clearNext() {
		next = null;
	}
	
	public void printData() {
		customer.printData();
	}
}
