package program7;

import java.io.*;
import java.util.*;

public class Stack implements Serializable {
	private static final long serialVersionUID = 10L;

	protected ArrayList<Account> stack;
	
	public Stack() {
		stack = new ArrayList<Account>();
	}
	
	public void push(Account toPush) {
		stack.add(toPush);
	}
	
	public Boolean pop() {
		if(stack.isEmpty()) {
			return false;
		}
		else {
			stack.removeLast();
			return true;
		}
	}
	
	public Account peek() {
		return stack.getLast();
	}
	
	public int getSize() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	

}
