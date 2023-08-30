package Method;

import java.util.Scanner;

public class RecursiveArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to sum?");
		int t = sc.nextInt();
		int[] A = new int[t];
		for(int i = 0; i < A.length; i++) {
			System.out.println("Enter number: ");
			A[i] = sc.nextInt();
		}
		
		int x = sumarray(A, 0);
		System.out.println("The sum in arrays is " + x + ".");

	}
	
	public static int sumarray(int B[], int index) {
		if( index >= B.length)
			return 0;
		else
			return B[index] + sumarray(B, index+1);
	}

}
