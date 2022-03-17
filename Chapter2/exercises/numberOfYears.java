package exercises;
// This program prompts the user to enter a number of minutes. It then calculates how many years, and days that will make
// Author Aaron Rayan
import java.util.Scanner;


public class numberOfYears {
	public static void main(String[] args) {
		System.out.println("Enter the number of minutes to convert it to year(s) and day(s): ");
		Scanner input = new Scanner(System.in);
		
		int numberOfMinutes = input.nextInt();
		input.close();
		
		int numberOfYears = numberOfMinutes / 525600;
		int remainingMinutes = numberOfMinutes % 525600;
		int numberOfDays = remainingMinutes / 1440;
		remainingMinutes = remainingMinutes % 1440;
		
		System.out.println(numberOfMinutes + " minutes equals approximately " + numberOfYears + " year(s) and " + numberOfDays + " day(s)." );
	}

}
