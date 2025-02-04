package Arrays;

import java.util.Arrays;

public class ArraysBasics {

	public static void main(String[] args) {
		//Similar type of data in a collection
		//1.Static Array: Size is fixed
		//2.Dynamic array: Dynamic size, size is not fixed: ArrayList
		
		//1.Using new keyword
		int arr[] = new int [4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr[0]);
		
//		System.out.println(arr[4]); //ArrayIndexOutOfBoundsException
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------");
		for(int c : arr) {
			System.out.println(c);
		}
		
		
		//char array
		
		char ch[] = new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		
		System.out.println("--------------");
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println(Arrays.toString(ch));
		for(int i=ch.length-1;i>=0; i--) {
			System.out.println(ch[i]);
		} 
		
		//String array
		
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
		//Object Array:
		
		Object data[] = new Object[5];
		data[0] = "Prasad";
		data[1] = 23;
		data[2] = 'm';
		data[3] = 30.35;
		data[4] = true;
		
		System.out.println(Arrays.toString(data));
		
		for(Object e: data) {
			System.out.println(e);
		}
		
		//for reversing
		int p[] = new int [4];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;
		
		for(int i=p.length-1;i>=0; i--) {
			System.out.println(p[i]);
		} 
		
		int count = p.length-1;
		for(int e : p) {
			System.out.println(p[count]);
			count--;
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
