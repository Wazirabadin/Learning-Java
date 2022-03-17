package exercises;
// This program shows the current time based on the current time zone. Current time zones can be identified by the number of hours
// offset from GMT. For example Easter United States time is 5 hours behind GMT. The user thus enters -5 to specify easter time, etc.
// Author Aaron Rayan

import java.util.Scanner;

public class ShowCurrentTime {

	public static void main(String[] args) {
		System.out.println("Enter the hour offset from GMT (for example -5 for Atlantic time or 5.5 for India)");
		Scanner input = new Scanner(System.in);
		double zoneOffset = input.nextDouble();
		input.close();
		
		double totalMilliSeconds = System.currentTimeMillis() + (3600000 * zoneOffset) ;
		double totalSeconds = totalMilliSeconds / 1000;
		double currentSeconds = totalSeconds % 60;
		
		double totalMinutes = totalSeconds / 60;
		double currentMinutes = totalMinutes % 60;
		
		double totalHours = totalMinutes / 60;
		double currentHours = totalHours % 24;
		
		
		System.out.println("Local Time " + ((int)currentHours % 24) + ":" + ((int)currentMinutes)  + ":" + (int)currentSeconds );
		System.out.println();
	

	}

}
