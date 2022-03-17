package exercises;
// This program calculates the gratuity, and total amount due based on a 3 pre-determined gratuity rates of 15%, 20% and 25%
// Author Aaron Rayan
import java.util.Scanner;

public class CalculateTip {

	public static void main(String[] args) {
		System.out.println("Enter the ammount of your check: ");
		Scanner input = new Scanner(System.in);
		
		double checkAmount = input.nextDouble();
		input.close();
		
		double gratuity15 = (int)(checkAmount * 0.15 * 100) / 100.0;
		double gratuity20 = (int)(checkAmount * 0.2  * 100) / 100.0;
		double gratuity25 = (int)(checkAmount * 0.25  *100)/ 100.0;
		
		System.out.println("15% gratuity --- Total due : $" + (checkAmount + gratuity15) + ", includs gratuity of $" + gratuity15	);
		System.out.println("20% gratuity --- Total due : $" + (checkAmount + gratuity20) + ", includs gratuity of $" + gratuity20	);
		System.out.println("25% gratuity --- Total due : $" + (checkAmount + gratuity25) + ", includs gratuity of $" + gratuity25	);
	}

}