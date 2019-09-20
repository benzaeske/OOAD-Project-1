/* Pachyderms all use the wake and sleep methods inherited from Animal. All pachyderms walk around their enclosure
 * when raoming, and all eat the same thing. The makeNoise function is implemented in individual subclasses.
 */
public class Pachyderm extends Animal {

	public Pachyderm(String name) {
		super(name);
	}
	
	//Pachyderms all have the same roam function
	public void roam() {
		System.out.println(this.name + " the " + this.type + " walked around their enclosure");
	}
	
	//Pachyderms all eat the same veggies
	public void eat() {
		System.out.println(this.name + " the " + this.type + " ate all their veggies!");
	}

}
