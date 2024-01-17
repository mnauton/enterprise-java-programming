package InheritanceDemo;

public class Rectangle extends GeometricFigure {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public void display() {
		System.out.println("This is a rectangle with area " + getArea());
	}
}
