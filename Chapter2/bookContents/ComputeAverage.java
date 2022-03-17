package bookContents;
import java.util.Scanner;

public class ComputeAverage {
	public static void main(String[] args) {
		// declare variables of type double to hold values of 3 numbers and value of their average
		double number1;
		double number2;
		double number3;
		double average;
		
		// create a scanner object 
		Scanner input = new Scanner(System.in);
		
		// display a message to prompt the user to enter 3 numbers and assign them to the input variable
		System.out.println("Enter 3 number to calculate their average: ");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		number3 = input.nextDouble();
		input.close(); 					// close the input to prevent potential resource leak.
		
		average = (number1 + number2 + number3) / 3;
		System.out.println("The average value of " + number1 + " and " + number2 + " and " + number3 + " is " + average);
	}

}
