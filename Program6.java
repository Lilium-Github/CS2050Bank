// Abraham Maldonado
// 10/8/2024
// CS 2050

package program6;

import java.io.*;

public class Program6 {
	private static int[] nums = new int[] {932025223,326050758,146807540,561674690,574593109,
			457781466,783992225,624814822,996910450,158455399,
			683613205,837605192,142248781,218142200,413885667,
			967710454,684059236,704609338,497310738,324754785} ;
	
	private static String[] names = new String[] {"James", "Mary", "Michael", "Patricia",
			"Robert", "Jennifer", "John", "Linda", "David", "Elizabeth"};
	
	private static Queue customers = new Queue();
	
	private static Customer newCustomer;
	private static Account newAccount;
	
	public static double interestRate = 0.46;
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i < 4) {
				newAccount = new SavingsAccount(nums[i + 10], interestRate);
				newCustomer = new Customer(names[i], newAccount, nums[i]);
			}
			else {
				newAccount = new CheckingAccount(nums[i + 10]);
				newCustomer = new Customer(names[i], newAccount, nums[i]);
			}
			
			customers.enqueue(newCustomer);
		}
		
		try {
			FileOutputStream fileOut = new FileOutputStream(new File("CustomerQueue.txt"));
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			// Write objects to file
			objectOut.writeObject(customers);
			objectOut.close();
			fileOut.close();
			
		} catch (Exception e) {
			System.out.println("Something went wrong saving the customers.");
			e.printStackTrace();
		}
		
		// uncomment this to test the file saving :)
		
		/*
		try {
			FileInputStream fileIn = new FileInputStream(new File("CustomerQueue.txt"));
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			
			Queue newQueue = (Queue) objectIn.readObject();
			newQueue.printData();
			
			objectIn.close();
			fileIn.close();
		} catch (Exception e) {
			System.out.println("Something went wrong retrieving the customers.");
			e.printStackTrace();
		}
		*/
		
	}
}
