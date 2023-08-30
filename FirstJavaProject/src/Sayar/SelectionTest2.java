package Sayar;

public class SelectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 5, code = 2, result = 0;
		if(code == 1)
			result = num1 + num2;
		else if(code == 2)
			result = num1 - num2;
		else if(code == 3)
			result = num1 * num2;
		else if(code == 4)
			result = num1 / num2;
		System.out.println("Result: " + result);

	}

}
