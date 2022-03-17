package bookContents;
import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		System.out.println("Enter the purchace amount to calculate tax (rate 8%):");
		Scanner input = new Scanner(System.in);
		
		double purchaseAmount = input.nextDouble();
		input.close();
		double tax = (int) (purchaseAmount * 0.08) * 100 / 100.0;
		
		System.out.println("Sale's tax is $" + tax);
		System.out.print( "Your total amount due is $");
		System.out.println(purchaseAmount + tax);
	}

}
