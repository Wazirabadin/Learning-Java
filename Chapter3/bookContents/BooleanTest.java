package bookContents;
import java.util.Scanner;
// This program test the Boolean expressions

public class BooleanTest {

	public static void main(String[] args) {
		System.out.println("Enter values for x, y, and z followd by spaces: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.hashCode();
		input.close();
		
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
	}

}
