package bookContents;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in inches: ");
		double height = input.nextDouble();
		input.close();
		
		double metricWeight = weight * 0.4536;
		double metricHeight = height * 0.0254;
		
		double bmi = metricWeight / (metricHeight * metricHeight);
		
		System.out.println("Your BMI is " +(int)(bmi * 100) / 100.0);
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}