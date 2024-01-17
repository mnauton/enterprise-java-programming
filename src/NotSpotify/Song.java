package NotSpotify;

public class Song {
	
	// variable(s):
    private String title, artist;
    private int rating;
    private Genre genre;

	// method(s):

    public Song(String title, String artist, int rating, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.genre = genre;
    }

    public double getPrice() {
        return genre.setPrice(rating);
    }

    //  getPrice(double) - call the Genre.setPrice(int rating), use rating as argument

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating=" + rating +
                ", genre=" + genre +
                ", price=" + getPrice() +
                '}';
    }
}
