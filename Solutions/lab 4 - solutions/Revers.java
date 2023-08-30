/** 
 * File: Grades.java 
 * 
 */ 
import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {
		
		int count;
		int[] numbers;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		count = scan.nextInt();
		
		numbers = new int[count];
		
		System.out.print("Enter " + count + " numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}

		System.out.println("You entered");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();


		for (int i = 0; i < numbers.length/2; i++) {
			int t = numbers[i];
			numbers[i] = numbers[ numbers.length - 1 - i];
			numbers[ numbers.length - 1 - i] = t;
		}

		System.out.println("Reversed version of the numers you entered");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}