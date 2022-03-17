package exercises;
// This program calculates the minimum length of runway for an airplane with a specific ground speed and acceleration
// Author: Aaron Rayan

import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {
		System.out.println("Enter the groundspeed and acceleration of airplane to calculate the minimum runway length: ");
		Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		input.close();
		
		double runwayLength = speed * speed / (2 * acceleration);
		System.out.println("The minimu runway length for this airplane is " + ((int)( runwayLength * 100) / 100.0 )+ " units.");
	}

}
