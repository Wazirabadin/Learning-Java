package bookContents;
import java.util.Scanner;

public class AdditionQuize {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		input.close();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

	}

}
