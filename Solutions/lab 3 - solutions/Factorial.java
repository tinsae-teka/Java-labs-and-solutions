/** 
 * File: Factorial.java
 * 
 * Print out as many powers of 2 as the user requests
 */
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int factorial = 1; 
		int n;
		int count = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		n = scan.nextInt();

		while(n < 0){
			System.out.println("You entered a negative number, a non-negative integer is required");
			System.out.print("Enter a non-negative integer: ");
			n = scan.nextInt();
		}

		while(count <= n){
			factorial = factorial * count;
			count++;
		}
		
		System.out.println( n + "! = " + factorial);

	}
}