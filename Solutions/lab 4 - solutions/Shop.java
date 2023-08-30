/** 
 * File: Shop.java 
 * 
 * Uses the Item class to create items and add them to a shopping 
 * cart stored in an ArrayList.
 */ 
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	
	public static void main (String[] args) {
		ArrayList<Item> cart = new ArrayList<Item>();
		Item item;
		String itemName;
		double itemPrice;
		int quantity;
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
		
		do {
			System.out.print ("Enter the name of the item: ");
			itemName = scan.nextLine();
			System.out.print ("Enter the unit price: ");
			itemPrice = scan.nextDouble();
			System.out.print ("Enter the quantity: ");
			quantity = scan.nextInt();
			scan.nextLine();
			// Create a new item and add it to the cart
			item = new Item(itemName, itemPrice, quantity);
			cart.add(item);
			
			// Print the contents of the cart object using println
			System.out.println("Current cart content");
			double total = 0;
			for (int i = 0; i < cart.size(); i++) {
				item = cart.get(i);
				System.out.println("Name: " + item.getName());
				System.out.println("Unit Price: " + item.getPrice());
				System.out.println("Quantity: " + item.getQuantity());
				total += (item.getPrice() * item.getQuantity());
			}
			System.out.println("Total in the cart " + total);

			System.out.print ("Continue shopping (y/n)? ");
			keepShopping = scan.next();
			scan.nextLine();
		}while (keepShopping.equals("y"));
	}
}