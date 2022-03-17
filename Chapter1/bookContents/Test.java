package bookContents;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter 3 enteger to determine they are sorted or not:");
		Scanner input = new Scanner(System.in);
		input.close();
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		System.out.println((x < y && y < z) ? "sorted" : "not sorted" );
	
	}

}
