package PhraseOMatic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhraseOMatic2 {
	public static void main(String[] args) {

		int sentencesNum;

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number of sentences required: ");

        try {
            sentencesNum = number.nextInt();
            number.close();
			System.out.println("The number of sentences required is: " + sentencesNum + "\n");  // Output user input

		} catch (InputMismatchException e) {
            System.out.println("Please provide the number of sentences as an integer number.");
            return;
        }

        Phrase myPhrase = new Phrase();

		System.out.println("Please find below the " + sentencesNum + " generated sentences: ");
        for (int n = 0; n <= sentencesNum - 1; n++) {
            myPhrase.generatePhrase();
        }
    }
}
