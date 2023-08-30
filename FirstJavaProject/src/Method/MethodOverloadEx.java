package Method;

public class MethodOverloadEx {
	
	public static void Sum() {
		int a = 20;
		int b  = 30;
		System.out.println("Sum = " + (a + b));
	}
	
	public static int Sum(int a) {
		int b = a + 12;
		return b;
	}
	
	public static void Sum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}
	
	public static void Sum(float a, float b) {
		System.out.println("Sum = " + (a + b));
	}
	
	public static int Sum(int a, int b, float c) {
		return (int) (a + b + c);
	}
	
	public static float Sum(float a, float b, float c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum();
		System.out.println("Sum " + Sum(2));
		Sum(3, 4);
		Sum(4.5f, 6.7f);
		System.out.println("Sum " + Sum(2, 3, 6.7f));
		System.out.println("Sum " + Sum(2.3f, 6, 3.4f));
		
		System.out.println(Math.random()*2);
	} 

}
