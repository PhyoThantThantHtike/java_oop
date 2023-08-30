package Sayar;

public class ForLoopIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}
		System.out.println("===============");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		//a
		for(int a = 1; a<= 10; a++) {
			for(int b=1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		//b
		for(int a = 1; a <= 10; a++) {
			for(int b = 10; b >= a; b--) {
				System.out.print("*");
			}
			for(int b = 1; b <= a; b++) {
				System.out.print("");
			}
			System.out.println();
			}
		System.out.println("===============");
		
		//c
		for(int c = 10; c >= 1; c--) {
		      for(int d = 10; d >= c; d--) {
		        System.out.print(" ");
		      }
		      for(int d = 1; d <= c; d++) {
		        System.out.print("*");
		      }
		      System.out.println(); 
		    }
		System.out.println("===============");
		
		//d
		for(int e = 10; e >= 1; e--) {
		      for(int f = 1; f <= e; f++){
		        System.out.print(" ");
		      }
		      for(int  f = 10; f >= e; f--) {
		        System.out.print("*");
		      }
		      System.out.println();
		     }
		

	}

}
