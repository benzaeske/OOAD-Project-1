/*
 * Cats need to override the makeNoise and eat function inherited from Feline because they eat
 * differently than lions and tigers and also make different noises.
 */
public class Cat extends Feline {

	public Cat(String name) {
		super(name);
		this.type = "cat";
	}
	
	public void makeNoise() {
		System.out.println(this.name + " the " + this.type +  " meowed enthusiastically.");
	}
	
	public void eat() {
		System.out.println(this.name + " the " + this.type +  " ate their tuna.");
	}

}
