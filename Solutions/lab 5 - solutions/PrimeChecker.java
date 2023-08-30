public class PrimeChecker{
	
	public static boolean isPrime(int num){
		boolean returnValue = true;
		for (int i = 2; i < num / 2; i++ ) {
			if(num % i == 0) {
				returnValue = false;
				break;
			}
		}
		return returnValue;
	}

	public static void main(String[] args){
		
		System.out.println("Prime numbers between 1 and 500 ");
		for (int i = 0; i < 500; i++) {
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
	}
}