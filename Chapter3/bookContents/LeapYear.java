package bookContents;
// This program determines if a year is a leap year or not
// Input: Year (integer)
// Output: Leap year or regular year (Boolean)
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year number to determine if it is a leap year or not. ");
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		input.close();
		
		Boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		System.out.println(year + " is leap year? " + isLeapYear );
		
	}

}
