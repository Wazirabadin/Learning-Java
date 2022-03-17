package exercises;
// This program calculates the BMI (body mass index) based on pound and feet
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		System.out.println("This program calculates the Body Mass Index (BMI). Enter your weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in inches: ");
		double height = input.nextDouble();
		input.close();
		
		double metricWeight = weight * 0.4536;
		double metricHeight = height * 0.0254;
		
		double BMI = metricWeight / (metricHeight * metricHeight);
		
		System.out.println("wi: " + metricWeight);
		System.out.println("hi: " + metricHeight);
		System.out.println("Your BMI is: " + BMI);
	}

}
