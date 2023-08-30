/** 
 * File: Rectangle.java 
 * 
 * Represents a Rectangle. 
 */ 

public class Rectangle extends Shape {
	
	private double length;
	private double width ;
	
	/** 
	 * Constructor: Sets up the sphere. 
	 */ 
	public Rectangle(double l, double w ) {
		super("Rectangle");
		this.length = l;
		this.width = w;
	}
	
	/** 
	 * Returns the area of the rectangle.
	 */ 
	public double area() {
		return this.length * this.width;
	}

	/** 
	 * Returns the sphere as a rectangle. 
	 */ 
	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
	}
}