/** 
 * File: DogTest.java 
 * 
 * A simple test class that creates a Dog and makes it speak. 
 */ 

public class DogTest {
	
	public static void main(String[] args) {
		Yorkshire yorkshire = new Yorkshire("Bobby");
		Labrador labrador = new Labrador("Rex", "black");
		
		System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
		System.out.println(labrador.getName() + " says " + labrador.speak());
	}
}