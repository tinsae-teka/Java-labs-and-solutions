/** 
 * File: Salary.java 
 * 
 * Computes the raise and new salary for an employee
 */
import java.util.Scanner;

public class Salary {

	public static void main (String[] args) {
		double currentSalary; // current annual salary
		double rating; // performance rating
		double raise; // dollar amount of the raise
		
		Scanner scan = new Scanner(System.in);
		
		// Get the current salary and performance rating
		
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		
		System.out.print ("Enter the performance rating[1=excellent, 2=good, and 3=poor]: ");
		rating = scan.nextDouble();
		
		// Compute the raise
		if(rating == 1){
			raise = currentSalary * 0.06;
		}else if (rating == 2){
			raise = currentSalary * 0.04;
		}else if (rating == 3){
			raise = currentSalary * 0.015;
		}else {
			System.out.println("Invalid rating selected, zero assumed");
			raise = currentSalary * 0.0;
		}
		// Print the results
		System.out.println ("Amount of your raise: $" + raise);

		// Needed to add a bracket around currentSalary + raise so that the addition 
		// operator does not work as a concatenation
		System.out.println ("Your new salary: $" + (currentSalary + raise));
	}
}