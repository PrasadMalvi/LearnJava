package Strings;

public class StringsBasics {

	public static void main(String[] args) {
		
		String emp[] = new String[3];
		emp[0] = "Prasad";
		emp[1] = "Malvi";
		emp[2] = "Sabari";
		
		for(String e : emp) {
			System.out.println(e );
		}
		for(int i=emp.length-1;i>=0; i--) {
			System.out.println(emp[i]);
		}  
		
		String str = "Prasad";
		char c[] = str.toCharArray();
		System.out.println("--------------");
		for(int  i = c.length -1;i >= 0; i--) {
			System.out.print(c[i]);
		}
		
		int counter = str.length()-1;
		System.out.println();
		System.out.println("--------------");
		for(char e : c) {
			System.out.print(c[counter]);
			counter--;
		}

	}

}
