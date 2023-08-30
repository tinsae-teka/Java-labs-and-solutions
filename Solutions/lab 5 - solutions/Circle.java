public class Circle{
	private double radius;
	public Circle(){
		this.radius = 1.0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return this.radius;
	}
	public double getArea(){
		return Math.PI * Math.pow(this.radius, 2);
	}

}