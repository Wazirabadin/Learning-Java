package bookContents;
// This program demonstrates that the use of underscore between the digits of numbers are allowed for readability purposes and will be ignored in calculations.
public class UnderscoreAllowed {
	public static void main(String[] args) {
		long ssn = 333_23_6656;
		System.out.println("333_23_6654 is calculated as " + ssn + " meaning underscores are allowed and will be ingnored when used in calculation.");
	}

}
