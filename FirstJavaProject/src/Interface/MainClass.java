package Interface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(12.0);
		System.out.println("Circle Area: " + c.area());
		System.out.println("Circle Perimeter: " + c.perimeter());
		
		Rectangle r = new Rectangle(2.0, 3.0);
		System.out.println("Rectangle Area: " + r.area());
		System.out.println("Rectangle Perimeter: " + r.perimeter());
		
		Triangle t = new Triangle(7, 12, 13);
		System.out.println("Triangle Area: " + t.area());
		System.out.println("Triangle Perimeter: " + t.perimeter());

	}

}
