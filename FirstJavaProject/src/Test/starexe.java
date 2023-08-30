package Test;

public class starexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			for(int k = 1; k < i; k++) {
				System.out.print("s");
			}
			for(int j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
