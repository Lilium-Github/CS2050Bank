// Abraham Maldonado
// CS 2050
// 10/8/2024

package program7;
import java.util.*;

public class Program7 {
	private static Random rand = new Random();
	private static double randDouble;
	private static int randInt;
	
	private static int[] nums = new int[60];
	
	public static Stack checkingStack = new Stack();
	public static Stack savingsStack = new Stack();
	
	private static String[] names = new String[] {"James", "Mary", "Michael", "Patricia",
			"Robert", "Jennifer", "John", "Linda", "David", "Elizabeth"};
	
	private static Queue customers = new Queue();
	
	private static Customer tempCustomer;
	private static Account newAcc;
	
	public static double interestRate = 0.46;
	
	public static void main(String args[]) {
		for(int i = 0; i < 60; i++) {
			randInt = rand.nextInt(100000000, 999999999);
			nums[i] = randInt;
		}
		
		for(int i = 0; i < 50; i++) {
			if(i < 25) {
				newAcc = new CheckingAccount(nums[i]);
				checkingStack.push(newAcc);
			}
			else {
				newAcc = new SavingsAccount(nums[i], interestRate);
				savingsStack.push(newAcc);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			tempCustomer = new Customer(names[i], nums[i+50]);
			customers.enqueue(tempCustomer);
		}
		
		for(int i = 0; i < 30; i++) {
			tempCustomer = customers.dequeue().getData();
			
			if(tempCustomer.getAccount() == null) {
				if(i % 2 == 0) {
					tempCustomer.setAccount(checkingStack.peek());
					checkingStack.pop();
				}
				else {
					tempCustomer.setAccount(savingsStack.peek());
					savingsStack.pop();
				}
			}
			
			else {
				randDouble = rand.nextDouble(-10000,10000);
				if(randDouble < 0) {
					tempCustomer.getAccount().withdraw(randDouble * -1);
				}
				else {
					tempCustomer.getAccount().deposit(randDouble);
				}
			}
			customers.enqueue(tempCustomer);
		}
		
		customers.printData();
	}
}
