package OOPSConcept.AbstractionConcept;
abstract class Animal{
	//can have an Constructor
	Animal(){
		System.out.println("You are creating a Costructor");
	}
	//can have abstract methods
	abstract void walk();
	//Can have non-abstract methods
	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Horse extends Animal{
	Horse(){
		System.out.println("You are creating a Derived Costructor");
	}
	public void walk() {
		System.out.println("Walk on 4 legs");
	}
}

class Chicken extends Animal{
	public void walk() {
		System.out.println("Walk on 2legs");
	}
}
public class AbstractionAbstract {

	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		
		
		//Error Cannot instantiate
//		Animal animal = new Animal();
//		animal.walk();

	}

}
