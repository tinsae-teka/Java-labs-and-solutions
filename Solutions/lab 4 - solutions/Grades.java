/** 
 * File: Grades.java 
 * 
 */ 
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		int noOfQuestions;
		int[] keys;
		int correct;
		String stop;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of quesions in the quiz: ");
		noOfQuestions = scan.nextInt();
		
		keys = new int[noOfQuestions];
		
		System.out.print("Enter the correct answers: ");
		for (int i=0; i<keys.length; i++) {
			keys[i] = scan.nextInt();
		}

		do{
			correct = 0;
			System.out.print("Enter the answers for the quiz to be graded: ");
			for (int i=0; i<keys.length; i++) {
				int answer = scan.nextInt();
				if(answer == keys[i]){
					correct++;
				}
			}
			System.out.println("Number of correct answers: " + correct);
			System.out.println("Percent of correct answers: " + (correct * 100.0/keys.length) + "%");
			System.out.print("Grade another quiz? (y/n): ");
			stop = scan.next();
		}while(stop.equalsIgnoreCase("Y"));
	}
}