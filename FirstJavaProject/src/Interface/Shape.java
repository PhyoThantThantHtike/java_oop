package Interface;

public interface Shape {
	public double area();
	public double perimeter();

}

	class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * Math.PI * radius;
	}
}
	
	class Rectangle implements Shape{
		private double width;
		private double height;
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return width * height;
		}

		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			return 2.0 * (width + height);
		}
		
	}
	
	class Triangle implements Shape{
		private double a;
		private double b;
		private double c;
		
		public Triangle(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			double s = (a + b + c) / 2.0;
			return Math.sqrt(s * (s -a) * (s - b) * (s - c));
		}

		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			return a + b + c;
		}
		
	}
	
