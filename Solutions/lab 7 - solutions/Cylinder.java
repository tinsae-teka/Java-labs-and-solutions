/** 
 * File: Cylinder.java 
 * 
 * Represents a Cylinder. 
 */ 

public class Cylinder extends Shape {
	
	private double radius;
	private double height  ;
	
	/** 
	 * Constructor: Sets up the cylinder. 
	 */ 
	public Cylinder(double r, double h ) {
		super("Cylinder");
		this.radius = r;
		this.height = h;
	}
	
	/** 
	 * Returns the surface area of the sphere.
	 */ 
	public double area() {
		return Math.PI * radius*radius * height;
	}

	/** 
	 * Returns the sphere as a String. 
	 */ 
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}