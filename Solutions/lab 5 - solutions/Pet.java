public class Pet{
	private String name;
	private String animal;
	private int age;

	public Pet(String name, String animal, int age){
		this.name = name;
		this.animal = animal;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public String getAnimal(){
		return this.animal;
	}
	public void setAnimal(String animal){
		this.animal = animal;
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
}