public class Utility{
	public static char toLower(char c) {
		char returnValue = c;
		if( c <= 'Z' && c >= 'A'){
			returnValue = (char)(c + 32);
		}
		return returnValue;
	}

	public static boolean multipleOf(int a, int b){
		return a % b == 0;
	}

	public static String oddOrEven(int a){
		return a % 2 == 0? "even":"odd";
	}
	public static void asteriskSquare(int n){
		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j < n; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static double areaOfCircle(double r){
		return Math.PI * Math.pow(r,2);
	}

	public static String coinToss(){
		java.util.Random random = new java.util.Random();
		return random.nextInt(2) == 1? "HEAD":"TAIL";
	}

	public static char randomChar(){
		java.util.Random random = new java.util.Random();
		return (char)(random.nextInt(26) + 'A');
	}
	public static int randomInt(int start, int end){
		java.util.Random random = new java.util.Random();
		return (random.nextInt(end - start) + start);
	}

	public static String nameAMonth(int i){
		String returnValue = "Invalid month";

		switch(i){
			case 1:
				returnValue = "January";
				break;
			case 2:
				returnValue = "February";
				break;
			case 3:
				returnValue = "March";
				break;
			case 4:
				returnValue = "April";
				break;
			case 5:
				returnValue = "May";
				break;
			case 6:
				returnValue = "June";
				break;
			case 7:
				returnValue = "July";
				break;
			case 8:
				returnValue = "August";
				break;
			case 9:
				returnValue = "September";
				break;
			case 10:
				returnValue = "October";
				break;
			case 11:
				returnValue = "November";
				break;
			case 12:
				returnValue = "December";
				break;
		}
		return returnValue;
	}	
	public static void main(String[] args) {
		System.out.println("toLower('a') = " + toLower('a'));
		System.out.println("toLower('A') = " + toLower('A'));
		System.out.println("toLower('Z') = " + toLower('Z'));
		System.out.println("toLower('Q') = " + toLower('Q'));
		System.out.println("toLower('?') = " + toLower('?'));
		System.out.println("toLower('<') = " + toLower('<'));

		System.out.println("multipleOf(8,3) = " + multipleOf(8,3));
		System.out.println("multipleOf(10,4) = " + multipleOf(10,4));
		System.out.println("multipleOf(8,2) = " + multipleOf(8,2));
		System.out.println("multipleOf(18,9) = " + multipleOf(18,9));
		System.out.println("multipleOf(80,20) = " + multipleOf(80,20));

		System.out.println("oddOrEven(20) = " + oddOrEven(20));
		System.out.println("oddOrEven(0) = " + oddOrEven(0));
		System.out.println("oddOrEven(11) = " + oddOrEven(11));
		System.out.println("square of asterisks: 5");
		asteriskSquare(5);
		System.out.println("square of asterisks: 9");
		asteriskSquare(9);

		System.out.println("areaOfCircle(1) = " + areaOfCircle(1));
		System.out.println("areaOfCircle(1.5) = " + areaOfCircle(1.5));
		System.out.println("areaOfCircle(2.4) = " + areaOfCircle(2.4));
		System.out.println("areaOfCircle(3.4) = " + areaOfCircle(3.4));

		System.out.println("Tossing of a coin 5 times");
		for (int i = 0; i < 5 ; i++) {
			System.out.println(coinToss());
		}

		System.out.println("5 Random characters");
		for (int i = 0; i < 5 ; i++) {
			System.out.println(randomChar());
		}

		System.out.println("Number to Months of the Year");
		for (int i = 0; i < 14 ; i++) {
			System.out.println("Month " + i + " is " +nameAMonth(i));
		}

		System.out.println("randomInt(5,20) = " + randomInt(5, 20));
		System.out.println("randomInt(1,5) = " + randomInt(1,5));
		System.out.println("randomInt(49,240) = " + randomInt(49,240));
		System.out.println("randomInt(4,9) = " + randomInt(4,9));


	}
}