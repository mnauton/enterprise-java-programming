package GuessGame;

public class GuessGame {
	public void startGame() {
		// TODO create three players to play the game
		
		// TODO make a target number that the players have to guess
		
		// TODO loop until we have a winner
		// TODO at each iteration, players will be allowed to make a new guess
		// TODO print out the winner(s), if any of players guess correctly

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		int target = (int) (Math.random() * 10);
		System.out.println("The target number is " + target);

		boolean flag = true;

		while (flag) {

			int p1Guess = p1.guess();
			System.out.println("p1's guess is " + p1Guess);
			int p2Guess = p2.guess();
			System.out.println("p2's guess is " + p2Guess);
			int p3Guess = p3.guess();
			System.out.println("p3's guess is " + p3Guess);

			if (p1Guess == target) {
				System.out.println("P1 wins");
				flag = false;
			} else if (p2Guess == target) {
				System.out.println("P2 wins");
				flag = false;

			} else if (p3Guess == target) {
				System.out.println("P3 wins");
				flag = false;

			} else {
				System.out.println("Please play again");
			}
		}


	}
}
