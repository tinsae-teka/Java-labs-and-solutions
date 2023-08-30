abstract class Shape {
	private String shapeName;

	Shape(String name){
		this.shapeName = name;
	}
	abstract public double area();

	public String toString(){

		return this.shapeName;
	}
}