package OOPSConcept.EncapsulationConcept;

public class Encapsulation {
	//Class which consist of Methods and Variable is Encapsulation
	//declaring variable 
	String name;
	//Creating Method
	public void print() {
		System.out.println("Hello Welcome!!" + this.name);
	}
	public static void main(String[] args) {
		//Creating Object and constructor 
		Encapsulation e1 = new Encapsulation();
		e1.name = "Prasad";
		e1.print();
		

	}

}
