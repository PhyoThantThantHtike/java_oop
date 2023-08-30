package Array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		
		int [][] A = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j =0; j < col; j++) {
				System.out.println("Enter a value: ");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display data array: ");
		for(int i = 0; i < A.length; i++) {				//A.length = the number of rows
			for (int j =0; j < A[i].length; j++) {		// A[i].length = the number of columns
				System.out.print(A[i][j]+" ");			
			}
			System.out.println();
		}

	}

}
