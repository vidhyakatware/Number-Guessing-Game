/** Gloden task
 4. Number Guessing Game
The objective of this project is to design and develop a number guessing game in which
players attempt to guess a randomly generated number within a specified range. The game
should provide users with feedback about their guesses and keep them engaged in the
guessing process.

 */



package project1;


	import java.util.Scanner;

	public class Guess {

	        public static void guessingNumber() {
	                try (
	                                Scanner sc = new Scanner(System.in)) {

	                        int number = 1 + (int) (100
	                                        * Math.random());

	                        int K = 5;

	                        int i, guess;

	                        System.out.println(
	                                        "A number is chosen"
	                                                        + " between 1 to 100."
	                                                        + "Guess the number"
	                                                        + " within 5 trials.");

	                        for (i = 0; i < K; i++) {

	                                System.out.println(
	                                                "Guess the number:");

	                                guess = sc.nextInt();

	                                if (number == guess) {
	                                        System.out.println(
	                                                        "Well done Great job!"
	                                                                        + " You guessed the number...");
	                                        break;
	                                } else if (number > guess
	                                                && i != K - 1) {
	                                        System.out.println(
	                                                        "The number is "
	                                                                        + "higher than " + guess);
	                                } else if (number < guess
	                                                && i != K - 1) {
	                                        System.out.println(
	                                                        "The number is"
	                                                                        + " lower than " + guess);
	                                }
	                        }

	                        if (i == K) {
	                                System.out.println(
	                                                "You have exceeded" + " "
	                                                                + K + " your trials.");

	                                System.out.println(
	                                                "The number was " + number);
	                        }
	                }
	        }

	        public static void main(String arg[]) {

	                guessingNumber();
	        }
	}
	