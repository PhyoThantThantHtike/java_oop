package Sayar;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char repeat;
		do {
			Scanner sc = new Scanner(System.in);
			int result = 0;
			System.out.println("Enter first number");
			int fn = sc.nextInt();
			System.out.println("Enter second number");
			int sn = sc.nextInt();
			System.out.println("Enter any sign '+' or '-' or '*' or '/'");
			char sign = sc.next().charAt(0);
			switch(sign) {
			case '+': result = fn + sn;
			break;
			case '-': result = fn - sn;
			break;
			case '*': result = fn * sn;
			break;
			case '/': result = fn / sn;
			break;
			default: System.out.println("Invalid Input");
			}
			System.out.println("Result = " + result);
			System.out.println("Do you wnat to try again? Enter 'y' or 'n'");
			repeat = sc.next().charAt(0);
		}while(repeat == 'y');

	}

}
