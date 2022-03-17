package exercises;
// This program calculates the energy amount (in Joules) required to heat a mass of water (in Kilograms) 
// from an initial temperature to a final temperature

// Author Aaron Rayan
import java.util.Scanner;

public class WaterTemperature {

	public static void main(String[] args) {
		System.out.println("Enter the mass of water (kilogram)");
		Scanner input = new Scanner(System.in);
		
		double waterMass = input.nextDouble();
		System.out.println("Enter initial temperature (degree celsius): ");
		double initialTemperature = input.nextDouble();
		System.out.println("Enter final temperature (degree celsius): ");
		double finalTemperature = input.nextDouble();
		input.close();
		
		double energyAmount = waterMass * (finalTemperature - initialTemperature) * 4184;
		System.out.print("The energy needed to raise the temperature of a mass of water equal to " + waterMass + " kg");
		System.out.println(" from " + initialTemperature + " to " + finalTemperature + " is " + energyAmount + " Joules.");

	}

}
