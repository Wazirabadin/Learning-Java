package exercises;

public class AverageSpeedMiles {
	public static void main(String[] args) {
		System.out.println("Problem: A runner ran 14 km in 45 minutes and 30 seconds. Find her speed in miles per hour.");
		System.out.println();
		
		System.out.println("Solution: The speed is given as 14 km per 45 minutes and 30 seconds. ");
		System.out.println("First we need to convert that in kilometer per hour: ");
		System.out.print("14 km / (45.5 min x 1 hr / 60 min) = ");
		System.out.print(14 / (45.5 / 60));
		System.out.println(" km / hr");
		System.out.println();
		
		System.out.println("Now we proceed to convert this speed to miles / hr using the following formula: ");
		System.out.print("1 km = 1.609 mi, therefore, 18.46 km / hr = (18.46 / 1.609) mi / hr = ");
		System.out.print(18.46 / 1.609); 
		System.out.println(" km / hr");
		System.out.print("Therefore the speed of the runner is ");
		System.out.print(18.46 / 1.609);
		System.out.print(" km / hr");
	}

}
