/*
 * Rhinos inherit all their methods except makeNoise from Animal and pachyderm
 */
public class Rhino extends Pachyderm {

	public Rhino(String name) {
		super(name);
		this.type = "rhino";
	}
	
	//Rhinos make a snorting noise
	public void makeNoise() {
		System.out.println(this.name + " the " + this.type +  " snorted!");
	}

}
