public class Palindrome{

	public static boolean isPalindrome(long num){
		boolean returnValue = true;
		if(num < 0){
			returnValue = false; 
		}else {
			String input = "" + num;
			for (int i = 0; i<input.length() / 2; i++) {
				if(input.charAt(i) != input.charAt(input.length()-1-i)){
					returnValue = false;
					break;
				}
			}
		}
		
		return returnValue;
	}
	public static void main(String[] args) {
		long[] nums = new long[]{5, 121, 3443, 123454321, 55, 438, 2433 };

		for (int i = 0; i < nums.length; i++ ) {
			System.out.println(nums[i] + " is " + (isPalindrome(nums[i])? "": "not ") +"palindrome");
		}
	}
}