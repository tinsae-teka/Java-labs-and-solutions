import java.util.Scanner;
public class VowelChecker{
	
	public static boolean isVowel(char c){
		boolean returnValue = false;
		switch(c){
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				returnValue = true;
		}
		return returnValue;
	}

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Input a string: ");
		String input = scan.nextLine();

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if(isVowel(input.charAt(i))){
				count++;
			}
		}
		System.out.println("Your input '" + input + "' has " + count + " vowels");
	}
}