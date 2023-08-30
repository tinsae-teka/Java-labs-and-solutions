public class EvenChecker{
	
	public static boolean isEven(int num){
		return num % 2 == 0;
	}

	public static void main(String[] args){
		int a = 10, b = 29;
		System.out.println(a + " is " + (isEven(a) ? "even": "odd"));
		System.out.println(b + " is " + (isEven(b) ? "even": "odd"));
	}
}