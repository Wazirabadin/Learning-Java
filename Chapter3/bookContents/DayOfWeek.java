package bookContents;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter an integer for the day of the week (0 - 6):");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		input.close();
		
		switch (day) {
		case 0: System.out.println("Monday");
		break;
		case 1: System.out.println("Tuesday");
		break;
		case 2: System.out.println("Wednesday");
		break;
		case 3: System.out.println("Thursday");
		break;
		case 4: System.out.println("Friday");
		break;
		case 5: System.out.println("Saturday");
		break;
		case 6: System.out.println("Sunday");
		}
	}

}
