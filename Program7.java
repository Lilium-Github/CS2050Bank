// Abraham Maldonado
// CS 2050
// 10/8/2024

package program7;
import java.util.*;

public class Program7 {
	private static Random rand = new Random();
	private static double randDouble;
	
	private static int[] nums = new int[] {932025223,326050758,146807540,561674690,574593109,
			457781466,783992225,624814822,996910450,158455399,
			683613205,837605192,142248781,218142200,413885667,
			967710454,684059236,704609338,497310738,324754785,
			630164638,467160028,934658629,234236596,969247649,
			674274239,617337264,129870797,947861746,438835880,
			811005449,830780446,905243296,495749583,440599357,
			728279001,617870064,592145607,550316240,667657461,
			644662086,791912879,364157396,619368975,415886781,
			842970763,168340847,451707473,598433133,608098121,
			
			692287051,216969663,115622379,116479004,423700662,613092381,385196818,876415131,244449628,829139587} ;
	
	public static Stack checkingStack = new Stack();
	public static Stack savingsStack = new Stack();
	
	private static String[] names = new String[] {"James", "Mary", "Michael", "Patricia",
			"Robert", "Jennifer", "John", "Linda", "David", "Elizabeth"};
	
	private static Queue customers = new Queue();
	
	private static Customer tempCustomer;
	private static Account newAcc;
	
	public static double interestRate = 0.46;
	
	public static void main(String args[]) {
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
