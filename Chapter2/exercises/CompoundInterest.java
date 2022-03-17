package exercises;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your initial balance:");
		double startBalance = input.nextDouble();
		
		System.out.println("Enter the your monthly deposit");
		double monthlyDeposit = input.nextDouble();
		// Monthly interest rate based on annual interest rate of 5% is 0.05 / 12 = 0.00417
		input.close();
		
		double endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		startBalance = endBalance;
		endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		startBalance = endBalance;
		endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		startBalance = endBalance;
		endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		startBalance = endBalance;
		endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		startBalance = endBalance;
		endBalance = (startBalance + monthlyDeposit) * (1 + 0.00417);
		
		System.out.println((int)(endBalance * 100) / 100.0);
	}

}
