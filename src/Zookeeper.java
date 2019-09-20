import java.util.ArrayList;


public class Zookeeper {

	private String name;
	
	//Give the zookeeper a name
	public Zookeeper(String name) {
		this.name = name;
	}
	
	//Perform the zookeeper's daily actions
	public void dayAtTheZoo(Animal[] animals) {
		this.wake(animals);
		this.rollCall(animals);
		this.feed(animals);
		this.exercise(animals);
		this.shutDownZoo(animals);
	}
	
	//wake all animals (calls the wake function)
	public void wake(Animal[] animals) {
		System.out.println("-------------\n" + this.name + " is waking up the animals!\n-------------");
		for (int i = 0; i<animals.length; i++) {
			System.out.println(this.name + " is waking up " + animals[i].name);
			animals[i].wake();
		}
	}
	
	//roll call the animals (calls the makeNoise function)
	public void rollCall(Animal[] animals) {
		System.out.println("-------------\n" + this.name + " is roll calling the animals now!\n-------------");
		for (int i = 0; i<animals.length; i++) {
			System.out.println(this.name + " called to " + animals[i].name);
			animals[i].makeNoise();
		}
	}
	
	//feed the animals (calls the eat function)
	public void feed(Animal[] animals) {
		System.out.println("-------------\n" + this.name + " is feeding the animals now!\n-------------");
		for (int i = 0; i<animals.length; i++) {
			System.out.println(this.name + " is feeding " + animals[i].name);
			animals[i].eat();
		}
	}
	
	//exercise the animals (calls the roam function)
	public void exercise(Animal[] animals) {
		System.out.println("-------------\n" + this.name + " is exercising the animals now!\n-------------");
		for (int i = 0; i<animals.length; i++) {
			System.out.println(this.name + " just let out " + animals[i].name);
			animals[i].roam();
		}
	}
	
	//shuts down the zoo (calls the sleep function)
	public void shutDownZoo(Animal[] animals) {
		System.out.println("-------------\n" + this.name + " is shutting down the zoo!\n-------------");
		for (int i = 0; i<animals.length; i++) {
			System.out.println(this.name + " said goodnight to " + animals[i].name);
			animals[i].sleep();
		}
	}
	
}
