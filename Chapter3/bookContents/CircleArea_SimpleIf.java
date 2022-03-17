package bookContents;
import java.util.Scanner;

public class CircleArea_SimpleIf {

	public static void main(String[] args) {
		System.out.println("Enter the radius of circle to calculate it's area: ");
		Scanner input = new Scanner(System.in);
		
		double radius = input.nextDouble();
		input.close();
		
		if(radius > 0) {
			double area = 3.14159 * radius * radius;
			System.out.println("The area of circle is: " + area + " square units");
		}
		else {
			System.out.println("Incorrect value.");
		}
	}

}
