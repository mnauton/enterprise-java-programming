package NotSpotify;

public class Pop extends Genre {

    //TODO complete method override
    @Override
    double setPrice(int rating) {
		// Pop (€2.99 for 4 stars and above, €1.99 for 3 stars, and €0.00 for 2 stars and less)
		if (rating >= 4)
			return 2.99;
		else if (rating == 3)
			return 1.99;
		else
			return 0.00;
		}

	@Override
	public String toString() {
		return "Pop";
	}
}
