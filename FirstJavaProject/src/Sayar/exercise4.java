package Sayar;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int a = 0; a < 10; a++) {
			
			for(int c = 1; c < a; c++) {
				System.out.print("");
			}
			for(int b = 10; b > a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
