package exercises;

public class ApproximatePi {
	public static void main(String[] args) {
		System.out.println("The value of Pi can be approximated using the following formula: ");
		System.out.print("4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...  ) = ");
		System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
	}

}
