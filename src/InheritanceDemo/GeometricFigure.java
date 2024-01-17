package InheritanceDemo;

public class GeometricFigure {
	public static double PI = 3.14159265;
	private boolean filled;

	public GeometricFigure() {
		filled = false;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void display() {
		System.out.println("This is some geometric figure.");
	}
}
