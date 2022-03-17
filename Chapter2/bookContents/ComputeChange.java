package bookContents;
import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		System.out.println("Enter amount of your money to convert it to change: ");
		Scanner input = new Scanner(System.in);
		
		double amount = input.nextDouble();
		input.close();
		
		int numOfCents = (int)(amount * 100);
		
		int numOfHundreds = numOfCents / 10000;
		int remainingAmount = numOfCents % 10000;
		
		int numOfFifties = remainingAmount / 5000;
		remainingAmount = remainingAmount % 5000;
		
		int numOfTwenties = remainingAmount / 2000;
		remainingAmount = remainingAmount % 2000;
		
		int numOfTens = remainingAmount / 1000;
		remainingAmount = remainingAmount % 1000;
		
		int numOfFives = remainingAmount / 500;
		remainingAmount = remainingAmount % 500;
		
		int numOfTwos = remainingAmount / 200;
		remainingAmount = remainingAmount % 200;
		
		int numOfOnes = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numOfQuarters = remainingAmount /  25;
		remainingAmount = remainingAmount % 25;
		
		int numOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		System.out.println();
		System.out.println( "$" + amount + " can be changed to:");
		System.out.println();
		System.out.println("(" + numOfHundreds + ")" + " hundred dollar bill(s)");
		System.out.println("(" + numOfFifties + ")" +  " fifty dollar bill(s)");
		System.out.println("(" + numOfTwenties + ")" + " twenty dollar bill(s)");
		System.out.println("(" + numOfTens + ")" +  " ten dollar bill(s)");
		System.out.println("(" + numOfFives + ")" +  " five dollar bill(s)");
		System.out.println( "(" +  numOfTwos + ")" + " two dollar bill(s)");
		System.out.println("(" + numOfOnes + ")" +" one dollar bill(s)");
		System.out.println("and");
		System.out.println("(" + numOfQuarters + ")" +  " quarter(s)");
		System.out.println("(" + numOfDimes + ")" +  " dime(s)");
		System.out.print("(" + numOfNickels + ")" +  " nickel(s)");
		System.out.println((", and " + "(" + remainingAmount + ")" + " cent(s)"));
	}

}
