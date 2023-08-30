package Sayar;

import java.util.Scanner;

public class SwitchTestex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char testCase = sc.next().charAt(0);
		if(testCase == 'a') {
			System.out.println('b');
		}
		else if(testCase == 'b') {
			System.out.println('c');
		}
		else 
			System.out.println('a');

	}

}
