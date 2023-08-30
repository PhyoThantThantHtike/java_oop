package SampleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		double area = width * height ;
		System.out.println("Area of Rectangle = " + area);

	}

}
