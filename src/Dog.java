/*
 * Dogs eat kibble and play when they roam. All other methods are inherited from its superclasses.
 */
public class Dog extends Canine {

	public Dog(String name) {
		super(name);
		this.type = "dog";
	}
	
	//Dogs eat kibble.
	public void eat() {
		System.out.println(this.name + " the " + this.type +  " ate their kibble.");
	}
		
	//Dogs play instead of just roaming.
	public void roam() {
		System.out.println(this.name + " the " + this.type +  " played with their toy!");
	}

}
