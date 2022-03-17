package bookContents;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println((int) 1.7);
		System.out.println((double) 3);
		System.out.println((double) 1 / 2); 	// first 1 is converted to 1.0 and then divided by 2
		
		System.out.println((int)(0.06 * 100) / 100.0);
		
	}

}
