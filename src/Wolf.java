/*
 * Wolves eat rabbit meat and check out their territory when they roam. All other methods are inherited
 * from its superclasses.
 */
public class Wolf extends Canine {

	public Wolf(String name) {
		super(name);
		this.type = "wolf";
	}
	
	//Wolves eat rabbit meat.
	public void eat() {
		System.out.println(this.name + " the " + this.type +  " ate their rabbit meat.");
	}
	
	//When wolves roam they make sure their territory is ok.
	public void roam() {
		System.out.println(this.name + " the " + this.type +  " inspected their territory.");
	}

}
