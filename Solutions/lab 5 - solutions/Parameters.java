/**
 * File: Parameters.java 
 * 
 * Illustrates the concept of a variable parameter list. 
 */ 
import java.util.Scanner;

public class Parameters {

	/** 
	 * Calls the average and minimum methods with 
	 * different numbers of parameters.
	 */ 
	public static void main(String[] args) {
		double mean1, mean2, mean3, mean4, mean5;
		int min1, min2, min3, min4, min5;
		Scanner scan  = new Scanner(System.in);

		mean1 = average(42, 69, 37);
		mean2 = average(35, 43, 93, 23, 40, 21, 75);
		mean3 = average(13);
		mean4 = average();
		System.out.println ("mean1 = " + mean1);
		System.out.println ("mean2 = " + mean2);
		System.out.println ("mean3 = " + mean3);
		System.out.println ("mean4 = " + mean4);
		int[] nums = new int[20];
		int count = 0;
		int input = -1;
		do{
			System.out.print("Enter an integer (negatvie number to stop:");
			input = scan.nextInt();
			if(input >= 0){
				nums[count] = input;
			}
			count++;
		}while(input >= 0 && count <= 20);
		mean5 = average(nums);
		System.out.println ("mean5 = " + mean5);
		

		min1 = min(42, 69, 37);
		min2 = min(35, 43, 93, 23, 40, 21, 75);
		min3 = min(13);
		min4 = min();
		min5 = min(nums);
		System.out.println ("min1 = " + min1);
		System.out.println ("min2 = " + min2);
		System.out.println ("min3 = " + min3);
		System.out.println ("min4 = " + min4);
		System.out.println ("min5 = " + min5);

	}

	/** 
	 * Returns the average of its parameters. 
	 */ 
	public static double average (int ... list) {
		double result = 0.0;
		
		if (list.length != 0) {
			int sum = 0;
			
			for (int num: list)
				sum += num;
			
			result = (double)sum / list.length;
		}
		return result;
	}
	/** 
	 * Returns the smallest of its parameters. 
	 */ 
	public static int min (int ... list) {
		int smallest = -100000;
		
		if (list.length != 0) {
			smallest = list[0];
			
			for (int num: list){
				if(smallest < num){
					smallest = num;
				}
			}
		}
		return smallest;
	}
}