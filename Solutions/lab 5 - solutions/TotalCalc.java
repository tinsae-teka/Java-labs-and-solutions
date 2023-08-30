public class TotalCalc{
	
	public static int getTotal(int num1, int num2){
		return num1 + num2;
	}

	public static void main(String[] args){
		int a = 10, b = 29;
		System.out.println(a + " + "  + b + " = " + getTotal(a,b));
	}
}