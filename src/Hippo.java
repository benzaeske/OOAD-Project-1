
public class Hippo extends Pachyderm {

	public Hippo(String name) {
		super(name);
		this.type = "hippo";
	}
	
	//Hippos make make a bellowing noise
	public void makeNoise() {
		System.out.println(this.name + " the " + this.type + " bellowed!");
	}

}
