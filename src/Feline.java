/*
 * Lions and Tigers have the same methods. However, cats eat differently and make different noises.
 * These methods will be overridden in the Cat subclass.
 */
public class Feline extends Animal{

	public Feline(String name) {
		super(name);
	}
	
	//Lions and tigers roar. This will be overridden in Cat because cats meow!
	public void makeNoise() {
		System.out.println(this.name + " the " + this.type + " let out a big roar!");
	}
	
	//Lions and tigers eat meat. This will be overridden in cat because cats eat tuna!
	public void eat() {
		System.out.println(this.name + " the " + this.type + " ate their meat.");
	}
	
	//Lions, tigers and cats all think they have territory.
	public void roam() {
		System.out.println(this.name + " the " + this.type + " walked around their territory.");
	}

}
