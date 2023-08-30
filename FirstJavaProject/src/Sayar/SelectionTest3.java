package Sayar;

public class SelectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 5, result = 0;
		char code = '+';
		if(code == '+')
			result = num1 + num2;
		else if(code == '-')
			result = num1 - num2;
		else if(code == '*')
			result = num1 * num2;
		else if(code == '/')
			result = num1 / num2;
		System.out.println("Result: " + result);

	}

}
