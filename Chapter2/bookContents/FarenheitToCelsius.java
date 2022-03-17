package bookContents;
// This program converts temperature given in Farenheit to that of Celsius

import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit: ");
		
		double farenheit = input.nextDouble();
		input.close();
		
		double celsius = 5.0 / 9 * (farenheit - 32);
		System.out.println(farenheit + " degrees farenheit is equal to " + celsius + " degrees celsius");
		
	}

}
