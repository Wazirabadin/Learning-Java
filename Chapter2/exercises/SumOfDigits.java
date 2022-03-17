package exercises;
// This program prompts the user to enter an integer between 0 and 1000. It then calculates the some of digits of the number.
// Author Aaron Rayan

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter an integer between 0 and 1000 to calculate the sum of its digits:");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		input.close();
		
		int hundredsDigit = number / 100;
		int remainingDigits = number % 100;
		int tensDigits = remainingDigits / 10;
		remainingDigits = remainingDigits % 10;
		
		System.out.println("The sume of digits of " + number + " is " + (hundredsDigit + tensDigits + remainingDigits));

	}

}
