package InheritanceDemo;

public class InheritanceDemo {

	public static void main(String[] args) {

		Circle myCircle = new Circle(21.00);
		System.out.println(myCircle instanceof Circle);
		System.out.println(myCircle instanceof GeometricFigure);

		myCircle.setFilled(true);
		myCircle.display();

		Rectangle myRectangle = new Rectangle(10.00, 50.00);
		myRectangle.display();

		GeometricFigure shape = new GeometricFigure();
		shape.display();

		Rectangle rect = new Rectangle(12.00, 15.00);
		rect.display();


	}

}
