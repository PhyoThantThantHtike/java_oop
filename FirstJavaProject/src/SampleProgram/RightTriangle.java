package SampleProgram;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hypotenue: ");
		double h = sc.nextDouble();
		System.out.println("Enter adjacent side: ");
		double a = sc.nextDouble();
		System.out.println("Enter opposite side: ");
		double o = sc.nextDouble();
		double H = h * h;
		double AO = (a * a) + (o * o);
		if (H==AO) {
			System.out.println("It is a right triangle.");
		}
		else {
			System.out.println("It is not a right triangle.");
		}

	}

}
