/** 
 * Count.java
 * 
 * This program reads in strings (phrases) and counts the number of blank 
 * characters and certain other letters in the phrase.
 */ 

import java.util.Scanner;

public class Count {
	
	public static void main (String[] args) {
		
		String phrase=""; // a string of characters
		int countBlank, countA, countB, countC; // the number of blanks (spaces) in the phrase
		int length; // the length of the phrase
		char ch; // an individual character in the string
		
		Scanner scan = new Scanner(System.in);
		
		// Print a program header
		System.out.println ();
		System.out.println ("Character Counter");
		System.out.println ();
		
		while(!phrase.equals("quit"))	{
			// Read in a string and find its length
			System.out.print ("Enter a sentence or phrase(quit to quit): ");
			phrase = scan.nextLine();
			length = phrase.length();
			
			// Initialize counts
			countBlank = 0;
			countA = 0;
			countB = 0;
			countC = 0;
			// a for loop to go through the string character by character
			for(int i=0; i < length; i++){
				ch = phrase.charAt(i);
				switch(ch){
					case ' ': 
						countBlank++;
						break;
					case 'a': 
					case 'A': 
						countA++;
						break;
					case 'b': 
					case 'B': 
						countB++;
						break;
					case 'c': 
					case 'C': 
						countC++;
						break;
				}
			}
			// and count the blank spaces
			// Print the results
			
			System.out.println ();
			System.out.println ("Number of blank spaces: " + countBlank);
			System.out.println ("Number of As: " + countA);
			System.out.println ("Number of Bs: " + countB);
			System.out.println ("Number of Cs: " + countC);
			System.out.println ();
		}
	}
}