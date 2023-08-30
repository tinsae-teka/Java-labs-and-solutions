public class RecursionDemo{
	
	public static int factorial (int n) {
		if(n == 1){
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

	public static int fibonacci  (int n) {
		if(n <= 1){
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static int powerN(int base, int n) {
		if(n <= 1){
			return base;
		}else {
			return base * powerN(base, n-1);
		}
	}

	public static int countX(String s) {
		int returnValue = 0;
		if(s.length() > 0){
			if(s.charAt(0) == 'x'){
				returnValue = 1;
			}
			returnValue += countX(s.substring(1, s.length()));
		}
		return returnValue;
	}

	public static int countHi(String s) {
		int returnValue = 0;
		if(s.length() > 1){
			if(s.charAt(0) == 'h' && s.charAt(1) == 'i'){
				returnValue = 1 + countHi(s.substring(2, s.length()));;
			}else{
				returnValue = countHi(s.substring(1, s.length()));;
			}
			
		}
		return returnValue;
	}

	
	public static boolean array220(int[] arr, int index){
		if(index >= arr.length){
			return false;
		}
		if(arr[index] * 10 == arr[index+1]) {
			return true;
		}else {
			return array220(arr, index+1);
		}
	}
	public static String allStar(String s) {
		String returnValue = "";
		if(s.length() > 1){
			returnValue = s.charAt(0) + "*" + allStar(s.substring(1, s.length()));
		}else {
			returnValue += s.charAt(0);
		}
		return returnValue;
	}
	public static void main(String[] args) {
		System.out.println(allStar("Hello"));
	}
}