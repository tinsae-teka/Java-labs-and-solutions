/**
 * LoveCS.java 
 * 
 * Use a while loop to print many messages declaring your 
 * passion for computer science 
 */ 
import java.util.Scanner;
public class LoveCS {
	public static void main(String[] args) {
		int limit = 0;
		int count = 1;
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many times do you want me to print : ");
		
		limit = scan.nextInt();

		while (count <= limit){
			System.out.println(count + " I love Computer Science!!");
			sum += count;
			count++;
		}

		System.out.println(" Printed this message " + limit + " times." 
			+ "The sum of the numbers from 1 to "+ limit + " is " + sum);
		
	}
}