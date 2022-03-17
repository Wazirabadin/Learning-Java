package exercises;
import java.util.Scanner;

public class LinearEquation_SlopeInt {
	public static void main(String[] args) {
		System.out.println("y = mx + b");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of m: ");
		double m = input.nextDouble();
		
		System.out.println("Enter value for b");
		double b = input.nextDouble();
		input.close();
		double slope = m;
		double y_int = b;
		double x_int = -b / m;		
		
		
		System.out.print("For linear equation y = " + (int)m + "x + " + (int)b);
		System.out.println(", slope = " + slope + ", x - intercept = " + x_int + ", and Y - intercept = " + y_int);
		
	}
}
