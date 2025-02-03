package OOPSConcept.AbstractionConcept;

interface Animal1{
	//Cannot create Constructor
	//Cannot have implementation / cannot have non-absrract method
	
	int eye = 2;
	void walk();
}

//can have multiple interface
interface Herbivore{
	
}

class Horse1 implements Animal1, Herbivore{
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

public class AbstractionInterafce {

	public static void main(String[] args) {
		
		Horse1 horse = new Horse1();
		horse.walk();
	}

}
