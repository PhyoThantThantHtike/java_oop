package Method;

import java.util.Scanner;

public class MethodExample9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght: ");
		int length = sc.nextInt();
		System.out.println("Enter width: ");
		int width = sc.nextInt();
		
		System.out.println("Area = " + area(length, width));
		
		System.out.println("Paarameter = " + perimeter(length, width));

	}
	
	public static int area(int l, int w) {
		return( l * w);
	}
	
	public static int perimeter(int l, int w) {
		return(2 * (l + w));
	}

}
