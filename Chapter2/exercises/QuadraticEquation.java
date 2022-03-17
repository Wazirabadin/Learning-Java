package exercises;
import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		System.out.println("			             2");
		System.out.println("Quadratic equation in in the form: ax + bx + c = 0");
		System.out.println();
		System.out.println("The following program let's you to specify the values for a, b and c and calculates the two roots of the equation.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter value of a:");
		double a = input.nextDouble();
		
		System.out.println("Enter value of b:"); 
		double b = input.nextDouble();
		System.out.println("Enter value of c:");
		double c = input.nextDouble();
		input.close();
		
		double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
		double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
		
		System.out.println("    			2");
		System.out.println("The roots of equation " + (int) a + "X + " + (int)b + "X + " + (int)c + " = 0 are:");
		System.out.println();
		System.out.println(" X = " + root1 + " , X = " + root2);
	}

}
