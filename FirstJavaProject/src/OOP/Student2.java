package OOP;

import java.util.Scanner;

public class Student2 {
	
	public Student2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Name is "+ name + " and Age is " + age + ".");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st = new Student2();
		
		

	}

}
