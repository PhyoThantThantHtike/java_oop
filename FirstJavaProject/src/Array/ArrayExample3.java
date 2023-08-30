package Array;

import java.util.Arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {10, 20, 30, 40, 50};
		
		int[] B = A;
		
		if ( Arrays.equals(A,B))//if (A== B)//if (A.equals(B))
			System.out.println("is equal ");
		else
			System.out.println("is not equal");

	}

}
