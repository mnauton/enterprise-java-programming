package InheritanceDemo;

public class BoxWeight extends Box{
	//weight of the box
	double weight;

	//constuctor
	public BoxWeight( int w, int h, int d, double m) {
		weight = m;
		height = h;
		depth = d;
		width = w;
	}
}
