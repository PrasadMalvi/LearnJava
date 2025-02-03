package OOPSConcept;

class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Student Name : "+ this.name);
		System.out.println("Student Name : "+ this.age);
	}
}

public class ConstructorConcept {
	public static void main(String[] args) {
		Student s1 = new Student("Prasad", 23);
		s1.printInfo();
		
	}
	
}
