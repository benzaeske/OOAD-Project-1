
public class Elephant extends Pachyderm {

	public Elephant(String name) {
		super(name);
		this.type = "elephant";
	}
	
	//Elephants make a trumpet sound
	public void makeNoise() {
		System.out.println(this.name + " the " + this.type + " trumpeted loudly!");
	}

}
