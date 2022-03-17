package bookContents;
// This program simulates a lottery 
// Input: two digit number (integer)
// Output: outcome of the lottery
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 100);
		System.out.println("Enter your guess as a two digit number: ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		input.close();
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		if(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
			System.out.println("Exact match! You win $10,000. The correct number was " + lottery + ".");
		}
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 ) {
			System.out.println("Digits match! You win $3,000. The correct number was " + lottery + ".");
		}
		else if (guessDigit1 == lotteryDigit1  || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1) {
			System.out.println("One digit match. You win $500. The correct number was " +  lottery + "." );
		} else {
			System.out.println("Sorry, you didn't win. Maybe next time. The correct number was " + lottery + ".");
		}
	}
}
