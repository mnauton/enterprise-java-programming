package InheritanceDemo;

public class Circle extends GeometricFigure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("This is a circle with radius " + radius);
		System.out.println("This circle is " + (isFilled()? "filled":"unfilled"));


	}
}
