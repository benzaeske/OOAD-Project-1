import java.util.ArrayList;
import java.io.*;


public class Zoo {
	
	public static void main(String args[]) throws FileNotFoundException {
		//Create the Zookeeper
		Zookeeper bob = new Zookeeper("Bob");
		//Create the cats
		Cat cersei = new Cat("Cersei");
		Cat cameron = new Cat("Cameron");
		//Create the Tigers
		Tiger tim = new Tiger("Tim");
		Tiger tammy = new Tiger("Tammy");
		//Create the lions
		Lion leo = new Lion("Leo");
		Lion lenny = new Lion("Lenny");
		//Create the Elephants
		Elephant ella = new Elephant("Ella");
		Elephant ed = new Elephant("Ed");
		//Create the Rhinos
		Rhino rea = new Rhino("Rea");
		Rhino rob = new Rhino("Rob");
		//Create the hippos
		Hippo homer = new Hippo("Homer");
		Hippo haley = new Hippo("Haley");
		//Create the dogs
		Dog doug = new Dog("Doug");
		Dog daniel = new Dog("Daniel");
		//Create the wolves
		Wolf wesley = new Wolf("Wesley");
		Wolf wanda = new Wolf("Wanda");
		//Put the animals in a list:
		Animal[] zoo = {cersei, cameron, tim, tammy, leo, lenny, ella, ed, rea, rob, homer, haley, doug, daniel, wesley, wanda};
		
		//Redirect the output to a dayatthezoo.out file. Courtesy of: (https://www.geeksforgeeks.org/redirecting-system-out-println-output-to-a-file-in-java/)
		PrintStream o = new PrintStream(new File("dayatthezoo.out"));
		//Save the old System.out
		PrintStream console = System.out;
		//Set it to the new text file
		System.setOut(o);
		
		//Perform a day at the zoo!
		bob.dayAtTheZoo(zoo);
	} 

}
