package bookContents;
import java.util.Scanner;
// This program accepts integer for the number of seconds and converts it to minutes and seconds (if required)

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds to convert it to minutes and seconds: ");
		int secondsInput = input.nextInt();
		input.close();
		int minutes = secondsInput / 60;
		int seconds = secondsInput % 60;
		
		System.out.println(secondsInput + " seconds is equal to " + minutes + " minutes and " + seconds + " seconds.");
		
	}

}
