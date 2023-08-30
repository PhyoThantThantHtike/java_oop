package Method;

public class MethodExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 9, 5, 2, 4}; 
		int[] B = { 7, 3, 1, 9};
		
		int[] c = Add(A, B);
		display(c);

	}
	
	public static int[] Add(int[] A, int[] B) {
		int[] C = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] + B[i];
		}
		return C;
	}
	
	public static void display(int[] d) {
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i]+" ");
		}
	}

}
