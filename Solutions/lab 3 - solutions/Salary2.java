/** 
 * File: Salary.java 
 * 
 * Computes the amount of a raise and the new salary for an employee. 
 * The current salary and a performance rating (a String: "Excellent", 
 * "Good" or "Poor") are input.
 * 
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary2 {
	public static void main (String[] args) {
		double currentSalary; // employee's current salary
		double raise; // amount of the raise
		double newSalary; // new salary for the employee
		String rating; // performance rating
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		
		System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.next();
		

		// You can use equalsIgnoreCase instead of equals to match the string regardless of case
		if(rating.equals("Excellent")){
			raise = currentSalary * 0.06;
		}else if (rating.equals("Good")){
			raise = currentSalary * 0.04;
		}else if (rating.equals("Poor")){
			raise = currentSalary * 0.015;
		}else {
			System.out.println("Invalid rating selected, zero assumed");
			raise = currentSalary * 0.0;
		}
		// Compute the raise using if ...
		newSalary = currentSalary + raise;
		
		// NumberFormat is a standard library class from java.text package 
		// It helps in formatting numbers in various formats
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		// Print the results
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary: " + money.format(newSalary));
		System.out.println();
	}
}