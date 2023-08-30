package Sayar;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String repeat;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			System.out.println("Enter any operator");
			char op = sc.next().charAt(0);
			
			if( op == '+')
				System.out.println("Sum is " + (n1 + n2));
			else if( op == '-')
				System.out.println("Subtraction is " + (n1 - n2));
			else if( op == '*')
				System.out.println("Multiple is " + (n1 * n2));
			else if( op == '/')
				System.out.println("Division is " + (n1 / n2));
			else if( op == '%')
				System.out.println("Modulus is " + (n1 % n2));
			else
			System.out.println("Wrong input");
			
			System.out.println("Do you want to try again? Enter 'yes' or 'no'");
			repeat = sc.next();

		}while(repeat.equals("yes"));
	}

}
