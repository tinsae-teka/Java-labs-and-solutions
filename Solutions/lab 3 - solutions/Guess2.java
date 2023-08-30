/**
 * File: Guess.java 
 * 
 * Play a game where the user guesses a number from 1 to 10
 */
import java.util.Scanner;
import java.util.Random;

public class Guess2 {
	public static void main(String[] args) {
		
		int numToGuess; //Number the user tries to guess
		int guess; //The user's guess
		int higherGuess = 0;
		int lowerGuess = 0;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		//randomly generate the number to guess
		// generate a number between 0 and 9 and shift it by 1 
		// to be in the range 1 and 10
		numToGuess = generator.nextInt(9) + 1;
		
		
		do{
			//print message asking user to enter a guess
			System.out.print("Enter a guess [1-10]: ");
			//read in guess
			guess = scan.nextInt();
			if(guess > numToGuess){
				higherGuess++;
				System.out.print("Your guess is to high, guess a lower number: ");
			}else if(guess < numToGuess){
				lowerGuess++;
				System.out.print("Your guess is to low, guess a higher number: ");
			}else {
				System.out.println("Congratulations!!!! Your guess is correct");
				System.out.println("You made a total of " + ( + lowerGuess + 1) 
							+ " guesses (" + higherGuess + " Higher guesses & " + 
							lowerGuess + " Higher guesses)");
			}

		}while ( guess != numToGuess); //keep going as long as the guess is wrong
		
	}
}