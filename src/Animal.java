//The base class for all animals
public class Animal {
	
	public String name;
	//The type will be set by each of the subclasses (e.g. wolf or tiger)
	protected String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//All animals have the same wake up function.
	public void wake() {
		System.out.println(this.name + " the " + this.type + " has woken up!");
	}
	
	//To be implemented in subclasses
	public void makeNoise() {
		
	}
	
	//To be implemented in subclasses
	public void eat() {
		
	}
	
	//To be implemented in subclasses
	public void roam() {
		
	}
	
	//All animals have the same sleep function.
	public void sleep() {
		System.out.println(this.name + " the " + this.type +  " has gone to bed.");
	}
	
}
