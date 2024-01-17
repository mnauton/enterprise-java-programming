package NotSpotify;

public class Rock extends Genre {

	//TODO complete method override
	@Override
	double setPrice(int rating) {
// Rock (€3.99 for 4 stars and above, €2.99 for 3 stars, and €0.99 for 2 stars and less)
		if (rating >= 4)
			this.price =  3.99;
		else if (rating == 3)
			this.price = 2.99;
		else
			this.price = 0.99;

		return this.price;
	}

	@Override
	public String toString() {
		return "Rock";
	}
}

