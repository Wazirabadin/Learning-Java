package bookContents;
import java.util.Scanner;

public class computeAreaWithConsoleInput {
	public static void main(String[] args) {
		// declare variables of type double for radius and area
		double radius;
		double area;
		
		// create a scanner object and instruct it to read input of type double and assign it to radius variable
		Scanner input = new Scanner(System.in);
		// display a message on the console and prompt for circle's radius
		System.out.println("Enter a value for a circle's radius to calculate its area: ");
		radius = input.nextDouble();
		input.close();								// close the input to prevent potential resource leak.
		
		area = radius * radius * 3.14;				// compute the area and store the value in variable area
		// display the output
		System.out.println("The area of a circle with radius " + radius + " units is " + area + " square units.");		
	}

}
