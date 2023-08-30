/**
 * File: Trace.java
 * Purpose : An exercise in tracing a program and understanding 
 * assignment statements and expressions.
 */

import java.util.Scanner;

public class Trace {

	public static void main (String[] args) {
		int one, two, three;
		double what;

		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter two integers: ");
		one = scan.nextInt();			// 10
		two = scan.nextInt();			// 3

		System.out.print("Enter a floating point number: ");
		what = scan.nextDouble();		// 14.3
		three = 4 * one + 5 * two;		// 55
		two = 2 * one;					// 20

		System.out.println ("one " + two + ":" + three);
		one = 46 / 5 * 2 + 19 % 4;		// 21
		three = one + two;				// 13
		what = (what + 2.5) / 2;		// 8.4
	
		System.out.println (what + " is what!");
	}
}