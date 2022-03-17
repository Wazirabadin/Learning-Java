package exercises;
import java.util.Scanner;

public class LinearEquation_XY_Int {

	public static void main(String[] args) {
		System.out.print("This program calcualtes x - intercept, y - intercept and slope of the line ");
		System.out.println(" for equation Ax + By = C");
		
		System.out.println("Enter value for A: ");
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		
		System.out.println("Enter value for B: ");
		double B = input.nextDouble();
		
		System.out.println("Enter value for C: ");
		double C = input.nextDouble();
		input.close();
		
		double x_int = C / A;
		double y_int = C / B;
		double slope = - A / B;
		
		System.out.print("For equation " +(int) A + "x + " +(int) B + "y = " + (int)C);
		System.out.println(", x-intercept = " + x_int + ", y-intercept = " + y_int + " and Slope = " + slope);

	}

}
