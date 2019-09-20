/*
 * Canines have a randomly chosen makeNoise function. They eat differently however, and dogs and wolves
 * do different things when they roam. These will be implemented by the respective subclasses.
 */
public class Canine extends Animal {
	
	public Canine(String name) {
		super(name);
	}
	
	//Dogs and wolves can either bark, howl, or growl chosen randomly
	public void makeNoise() {
		//This will make a double between 0 and 3
		double selection = Math.random() * 3;
		//Choose a random noise based on the selection number above.
		if (selection < 1) {
			System.out.println(this.name + " the " + this.type +  " let out a bark!");
		}
		else if (selection < 2) {
			System.out.println(this.name + " the " + this.type +  " howled into the air!");
		}
		else {
			System.out.println(this.name + " the " + this.type + " growled.");
		}
	}

}
