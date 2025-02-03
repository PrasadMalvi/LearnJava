package OOPSConcept;


//Creating Class
public class Pen {
	
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing Something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
	public static void main(String [] args) {
		//Created Object
		Pen pen1 = new Pen();
		pen1.color = "Red";
		pen1.type = "Gel";
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "Red";
		pen2.type = "Gel";

		
		pen1.printColor();
		pen2.printColor();
	}
}
