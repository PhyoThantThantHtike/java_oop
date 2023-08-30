package Sayar;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			int result = 0;
			System.out.println("Enter '+' or '-' or '*' or '/'" );
			String con = sc.nextLine();
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			switch(con) {
			case "+": result = a + b;
			break;
			case "-": result = a - b;
			break;
			case "*": result = a * b;
			break;
			case "/": result = a / b;
			break;
			default: System.out.println("Invalid Input");
			}
			System.out.println("Result =" + result);
			System.out.println("Do you wnat to try again? Enter 'y' or 'n'.");
			c = sc.next().charAt(0);
		}while(c == 'y');

	}

}
