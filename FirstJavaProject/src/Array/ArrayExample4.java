package Array;

import java.util.Arrays;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-4, 6, 1, 56, 23, 2};
		
		System.out.println("Before sorting " + Arrays.toString(A));
		
		Arrays.sort(A);
		
		System.out.println("After sorting " + Arrays.toString(A));
		
		int index = Arrays.binarySearch(A, 6);
		
		if( index < 0) {
			System.out.println("Not found");
		}
		else {
			System.out.println(A[index] + " is found at index " + index);
		}
		
		int[] B = Arrays.copyOf(A, 7);
		
		System.out.println("B array value = " + Arrays.toString(B));
		
		Arrays.fill(B, 100);
		System.out.println("B array value = " + Arrays.toString(B));
		
		Arrays.fill(B, 1, 5, 888);
		System.out.println("B array value = " + Arrays.toString(B));
		
		int[] C = Arrays.copyOf(A, 6);
		
		boolean status = Arrays.equals(A, C);
		
		if ( status )
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
