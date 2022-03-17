package bookContents;
// This program converts temperature given in Celsius to that of Farenheit

import java.util.Scanner;

public class CelsiusToFarenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
		
		double celsius = input.nextDouble();
		input.close();
		
		double farenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " degrees celsius is equal to " + farenheit + " degrees farenheit.");
		
	}

}