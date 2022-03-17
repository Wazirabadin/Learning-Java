package bookContents;

public class ComputeArea {
	public static void main(String[] args) {
		// declare variables for radius and area of type double
		double radius;
		double area;
		
		radius = 20;							// read the radius
		area = radius * radius * 3.14;			// compute area of the circle
		// display the area
		System.out.println("The area of a circle with radius " + radius + " units is " + area + " square units.");
	}

}
