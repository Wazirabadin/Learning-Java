package bookContents;
import java.util.Scanner;

public class ComputeAreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159;
		double radius;
		double area;
		
		System.out.println("Enter the value of radius to calcualte the area of circle: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		input.close();
		
		area = PI * radius * radius;
		
		System.out.println("The area of a circle with radius " + radius + " is " + area + " square units.");
	}

}
