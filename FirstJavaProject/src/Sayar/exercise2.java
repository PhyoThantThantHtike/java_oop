package Sayar;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any month, eg'January'");
			String m = sc.next();
			switch(m) {
			case "March" : System.out.println("Summer");
			break;
			case "August" : System.out.println("Monsoon");
			break;
			case "December" : System.out.println("Winter");
			break;
			default: System.out.println("Wrong Input");
			}
		}
		

	}

}
