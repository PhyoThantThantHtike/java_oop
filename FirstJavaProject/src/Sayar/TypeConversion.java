package Sayar;

import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		
			System.out.println("Enter Username");
			String username = sc.nextLine();
			System.out.println("Enter Password");
			String password = sc.nextLine();
			if (username.equals("Phyo") && password.equals("123")) {
				System.out.println("Correct User");
			}
			else {
				System.out.println("Wrong User");
			}
			
		

	}

}
