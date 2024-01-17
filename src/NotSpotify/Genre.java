package NotSpotify;

abstract class Genre { // the superclass for our NotSpotify project

	// variable(s):
	public double price = 0.0;

	//  abstract method for genre sub-types
	abstract double setPrice(int rating);

	@Override
	public String toString() {
		return "Genre{" +
				"price=" + price +
				'}';
	}
}
