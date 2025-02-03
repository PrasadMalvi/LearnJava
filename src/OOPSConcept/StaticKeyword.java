package OOPSConcept;


class Student1{
	String name;
	static String school;
	
	public static void changeSchool() {
		school = "KLE";
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		
		Student1.school = "Christ";
		Student1 std1 = new Student1();
		std1.name = "Prasad";
		
		System.out.println(std1.school);
	}

}
