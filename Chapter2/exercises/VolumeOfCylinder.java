package exercises;
// This program reads area and length of a cylinder and calculates its volume
// Author: Aaron Rayan
import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		System.out.println("This program calculates the volume and surface area of a cylinder given its radius and length.");
		System.out.println();
		
		System.out.println("Enter the value for radius of cylinder:");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		System.out.println("Enter the value for lenght of cylinder:");
		double length = input.nextDouble();
		input.close();
		
		double circleArea = radius * radius * Math.PI;
		double volume = circleArea * length;
		double lateralArea = 2 * radius * Math.PI * length;
		double surfaceArea = lateralArea + 2 * circleArea;
		
		
		System.out.println("Given: " );
		System.out.println("Radius = " + radius + " units");
		System.out.println("Length = " + length + " units");
		System.out.println();
		System.out.println("Result:");
		// use unit casting to display 3 decimal places
		System.out.println("Volume = " + (int)(volume * 1000) / 1000.0 + " cubic units");
		System.out.println("Base Area = " + (int)(circleArea * 1000) / 1000.0 + " square units");
		System.out.println("Lateral Surface Area = " + (int)(lateralArea * 1000) / 1000.0 + " square units" );
		System.out.println("Total Surface Area = " + (int)(surfaceArea * 1000) / 1000.0 + " square units");
	
	}

}
