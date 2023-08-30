/** 
 * File: Sales.java 
 * 
 * Reads in and stores sales for each of 5 salespeople. Displays 
 * sales entered by salesperson id and total sales for all salespeople 
 */ 
import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		
		int noSalesperson;
		int[] sales;
		int sum;
		int maxIndex = 0;
		int minIndex = 0;
		int value;
		int sumAboveValue;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of salesperson: ");
		noSalesperson = scan.nextInt();
		
		sales = new int[noSalesperson];
		
		for (int i=0; i<sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
		}

		System.out.println("\nSalesperson Sales");
		System.out.println("--------------------");
		
		sum = 0;
		
		for (int i=0; i<sales.length; i++) {
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
			if(sales[maxIndex] < sales[i]){
				maxIndex = i;
			}
			if(sales[minIndex] > sales[i]){
				minIndex = i;
			}
		}
		
		System.out.println("\nTotal sales: " + sum);
		System.out.println("\nAverage  sales: " + (sum/sales.length));
		System.out.println("Salesperson " + (maxIndex + 1) + " had the highest sale with $" + sales[maxIndex]);
		System.out.println("Salesperson " + (minIndex + 1) + " had the lowest sale with $" + sales[minIndex]);

		System.out.print("Enter a value: ");
		value = scan.nextInt();
		System.out.println("List of ID of each salesperson exceeding " + value);
		sumAboveValue = 0;
		for (int i=0; i<sales.length; i++) {
			if(sales[i] > value){
				System.out.println(i+1);	
				sumAboveValue += sales[i];
			}
		}

		System.out.println("Sum of sales exceeding " + sumAboveValue);


	}
}