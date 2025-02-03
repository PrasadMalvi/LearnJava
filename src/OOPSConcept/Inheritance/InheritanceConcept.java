package OOPSConcept.Inheritance;



class Shape{
	String color;
}

class Triangle extends Shape{
	
}



//Single Inheritance
class Shape1{
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle1 extends Shape1{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

//MultiLevel Inheritance
class EquilateralTriangle extends Triangle1{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

//Hierarchical Inheritance

class Circle extends Shape1{
	public void area(int r) {
		System.out.println((3.142)*r*r);
	}
}

//Hybrid Inheritance 
//Consist of both Multilevel and Hierarchical
// in our program will be perform both of them each of them will be performing in some level

public class InheritanceConcept {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.color = "Red";
		
		
		
		Triangle1 t2 = new Triangle1();
		t2.area(2, 3);
		
	}

}