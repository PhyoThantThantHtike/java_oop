package Method;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int fact = factorial(num);
		System.out.println("Factorial = " + fact);
	}
	
	public static int factorial(int num) {
		if( num <= 1)
			return 1;
		else
			return num * factorial(num-1);
	}

}
