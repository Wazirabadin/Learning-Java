package exercises;
// This program calculates the area of a triangle based on the coordinates of points entered by the user
// Author Aaron Rayan
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the coordinates of three points separated by spaces, like x1 y1 x2 y2 x3 y3: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		// calculate the length of each side using formula sqrt(
		double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("The length of the sides of the triangle are: ");
		System.out.println("Side 1 = " + (int)(side1 * 100) / 100.0 + " unit");
		System.out.println("Side 2 = " + (int)(side2 * 100) / 100.0 + " unit");
		System.out.println("Side 3 = " + (int)(side3 * 100) / 100.0 + " unit");
		System.out.println();
		
		System.out.println("The area of the triangle is: " +((int)( area * 100) / 100.0 + 0.01 ) + " square unit");
	}

}
