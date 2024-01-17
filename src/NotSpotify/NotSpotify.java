package NotSpotify;

import java.util.ArrayList;
import java.util.List;

public class NotSpotify {

	public static void main(String[] args) {
		
		// dummy songs to test the setPrice() method and toString() override method
		Song s1 = new Song("Nothing Else Matters", "Metallica", 5, new Rock());
		Song s2 = new Song("November Rain", "Guns N Roses", 3, new Rock());
		Song s3 = new Song("When I Come Around", "Green Day", 2, new Rock());
		Song s4 = new Song("Lose Yourself", "Eminem", 1, new Rap());
		Song s5 = new Song("99 Problems", "Jay-Z", 4, new Rap());
		Song s6 = new Song("Jesus Walks", "Ye", 5, new Rap());
		Song s7 = new Song("Hit Me Baby One More Time", "Britney Spears", 3, new Pop());
		Song s8 = new Song("The A Team", "Ed Sheeran", 4, new Pop());
		Song s9 = new Song("Blinding Lights", "The Weekend", 1, new Pop());
		
		// TODO create a playlist for the Rock, Rap and Pop genre
		List<Song> playList1 = new ArrayList<>();
		playList1.add(s1);
		playList1.add(s2);
		playList1.add(s6);
		playList1.add(s9);
		playList1.add(s4);
		
		List<Song> playList2 = new ArrayList<>();
		playList2.add(s3);
		playList2.add(s8);
		playList2.add(s7);
		playList2.add(s4);
		playList2.add(s5);
		
		// TODO this is not very efficient, you need to refactor this code into a method that you can call

		getPlayList(playList2);
	}

	public static void getPlayList(List<Song> list) {
		double total = 0.0;
		for (Song s : list) {
			System.out.println(s.toString());
			total += s.getPrice();
		}
		System.out.println("Total fees: " + Math.round(total) + "\n");
	}
}
