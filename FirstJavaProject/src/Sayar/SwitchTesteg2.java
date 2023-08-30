package Sayar;

public class SwitchTesteg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 5, result = 0;
		char code = '-';
		switch(code) {
		case '+': result = num1 + num2;
		break;
		case '-': result = num1 - num2;
		break;
		case '*': result = num1 * num2;
		break;
		case '/': result = num1 / num2;
		break;
		default: System.out.println("Invalid Input");		
		}
		System.out.println("Result = " + result);

	}

}
