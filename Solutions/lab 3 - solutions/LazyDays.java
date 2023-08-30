import java.util.Scanner;

public class LazyDays{
	public static void main (String[] args) {
		double temperature; 
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter the temperature: ");
		temperature = scan.nextDouble();
		
		if(temperature > 95 || temperature < 20){
			System.out.println("Visit our shops!");
		}else if (temperature >= 80){
			System.out.println("Swimming");
		}else if (temperature >= 60){
			System.out.println("tennis");
		}else if (temperature >= 40){
			System.out.println("golf");
		}else{
			System.out.println("skiing");
		}
	}
}