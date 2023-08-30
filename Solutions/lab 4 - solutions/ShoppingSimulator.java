import java.util.Scanner;
import java.text.NumberFormat;

public class ShoppingSimulator{
	
	public static void main(String[] args){
		ShoppingCart sc = new ShoppingCart();
		Scanner scan = new Scanner(System.in);
		
		String stop;
		String name;
		int quantity;
		double price;

		do{
			System.out.println("Enter dtem details");
			
			System.out.print("Item Name: ");
			name = scan.nextLine();
			
			System.out.print("Quantity: ");
			quantity = scan.nextInt();
			
			System.out.print("Unit price: ");
			price = scan.nextDouble();

			sc.addToCart(name, price, quantity);
			
			System.out.println("Current cart content");
			System.out.println(sc.toString());
			System.out.println();


			System.out.print("Add another item? (y/n): ");
			stop = scan.next();
			scan.nextLine(); 
		}while(stop.equalsIgnoreCase("Y"));
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Please pay "+ fmt.format(sc.getTotalPrice()));
	}
}