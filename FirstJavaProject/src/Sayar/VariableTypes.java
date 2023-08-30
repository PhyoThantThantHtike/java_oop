package Sayar;

public class VariableTypes {
	static String name = "Phyo";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getname();
		VariableTypes vt = new VariableTypes();
		vt.getAge();		
	}
	
	public static void getname() {
		System.out.println(name);
	}
	
	public void getAge() {
		int age = 19;
		System.out.println(age);
	}

}
