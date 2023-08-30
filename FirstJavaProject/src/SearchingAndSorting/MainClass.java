package SearchingAndSorting;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		do {
			Scanner sc = new Scanner(System.in);
			ElectronicSystem ele = new ElectronicSystem();
			ele.WelcomePage();
			System.out.println("Do you want to try again? Enter yes or no.");
			s = sc.next();
		}while(s.equalsIgnoreCase("yes"));
	}

}
