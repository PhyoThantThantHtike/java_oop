package OOP;

public class Student {
	
	public Student(){
		System.out.println("This is created constructor. ");
	}
	
	public Student(String name) {
		System.out.println("The name is " + name);
	}
	
	public Student(int age) {
		System.out.println("The age is " + age);
	}
	
	public Student(boolean sc) {
		System.out.println("This statement is " + sc);
	}
	
	public Student(char p) {
		System.out.println("The character is " + p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Phyo");
		Student  st1 = new Student();
		Student st2 = new Student("Htet");
		Student age = new Student(18);
		Student sc = new Student(true);
		Student p = new Student('h');
		Student p1 = new Student('+');

	}

}
