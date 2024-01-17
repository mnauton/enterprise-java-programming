package NotSpotify;

public class Rap extends Genre {
	
	//TODO complete method override
	@Override
	double setPrice(int rating) {
// Rap (€4.99 for 4 stars and above, €3.99 for 3 stars, and €1.99 for 2 stars and less)
		if (rating >= 4)
			this.price = 4.99;
		else if (rating == 3)
			this.price = 3.99;
		else
			this.price = 1.99;
		return this.price;
	}

	@Override
	public String toString() {
		return "Rap";
	}
}
