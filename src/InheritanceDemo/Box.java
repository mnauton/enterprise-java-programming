package InheritanceDemo;

public class Box {
	double width;
	double height;
	double depth;

	//constructor clone of an object
	Box(Box ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	// constructor when all dimensions are specified
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	//blank constructor
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}

	//constructor for a cube
	Box(Double len)
	{
		width = height = depth = len;
	}

	// compute vol
	double volume()
	{
		return width * height * depth;
	}
}
