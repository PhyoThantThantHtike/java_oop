package Sayar;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String repeat;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sc.nextInt();
			switch (age) {
			case 18:
				System.out.println("You can participate");
				break;
			default:
				System.out.println("Please enter only age and you must be 18 or above to participate in our voting.");
			}
			System.out.println("Do you wish to proceed? Please enter 'yes' or 'no'");
			repeat = sc.next();

		} while (repeat.equalsIgnoreCase("yes"));

	}

}
