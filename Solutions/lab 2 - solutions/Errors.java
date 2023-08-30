/**
 * File: Errors.java
 * Purpose: A program with lots of syntax errors
 * Correct all of the errors (STUDY the program carefully!!)
 */

// Removed # 
import java.util.Scanner;

// class name should start with capital E

public class Errors {
	public static void main (String[] args) {
		// comment starts with double //
		String Name; // Name of the user
		
		int number;
		int numSq;
		
		Scanner scan = new Scanner(System.in);
		
		// missing ; at the end
		System.out.print ("Enter your name, please: ");

		// next int returns integer not a string
		Name = scan.next();
		
		// missing " at the end
		System.out.print ("What is your favorite number?");
		number = scan.nextInt();
		numSq = number * number;
		
		// missing two +s
		// the variable is numSq not numSquared
		System.out.println (Name +", the square of your number is "+
		numSq);
	}
}
