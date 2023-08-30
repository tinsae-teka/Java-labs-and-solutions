/** 
 * File: Runs.java 
 * 
 * Finds the length of the longest run of heads in 100 flips of a coin.
 */

import java.util.Scanner;

public class Runs {
	
	public static void main (String[] args) {
		
		final int FLIPS = 100; // number of coin flips
		int currentRun = 0; // length of the current run of HEADS
		int maxRun = 0; // length of the maximum run so far
		Scanner scan = new Scanner(System.in);
		
		// Create a coin object
		Coin c = new Coin();
		// Flip the coin FLIPS times
		for (int i = 0; i < FLIPS; i++) {
			// Flip the coin & print the result
			c.flip();
			System.out.println(c.toString());
			// Update the run information
			if(c.getFace() == c.HEADS){
				currentRun++;
				if(currentRun > maxRun){
					maxRun = currentRun;
				}
			}else{
				currentRun = 0;
			}
		}
		System.out.println("THe longsest run of heads is " + maxRun);
		// Print the results
	}
}