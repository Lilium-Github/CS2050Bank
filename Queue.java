package program6;

import java.io.*;

public class Queue implements Serializable {
	private static final long serialVersionUID = 99L;
	private QueueNode first;
	private QueueNode last;
	private QueueNode newNode;
	private QueueNode temp;
	private int length;
	
	public Queue() {
		first = null;
		last = null;
		length = 0;
	}
	
	public QueueNode getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return (first == null ) & (last == null);
	}
	
	public void enqueue(Customer data) {
		if(isEmpty()) {
			newNode = new QueueNode(data);
			first = newNode;
			last = newNode;
		}
		else {
			newNode = new QueueNode(data);
			last.setNext(newNode);
			last = last.getNext();
		}
		
		length++;
	}
	
	public QueueNode dequeue() {
		temp = first;
		first = first.getNext();
		length--;
		return temp;
	}
	
	public int getLength() {
		return length;
	}
	
	public void printData() {
		temp = first;
		for(int i = 0; i < length; i++) {
			temp.printData();
			temp = temp.getNext();
			System.out.println();
		}
	}
}
