package OOPSConcept.PolyMorphismConcept;

class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void printInfo(String name) {
		System.out.println("Student Name : "+ name);
		
	}
	public void printInfo(int age) {
		System.out.println("Student Name : "+ age);
	}
	public void printInfo(String name, int age) {
		System.out.println("Student Name : "+this.name +"Student Age : "+ this.age);
	}
}

public class PolymorpshimCompileTime {
	public static void main(String[] args) {
		Student s1 = new Student("Prasad", 23);
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		s1.printInfo(s1.name,s1.age);
	}
}
 
