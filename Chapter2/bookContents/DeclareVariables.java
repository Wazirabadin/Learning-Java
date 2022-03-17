package bookContents;

public class DeclareVariables {
	public static void main(String[] args) {
		// legal, all variables declared in on step and assigned in another step
		int i, j, k; 			
		i = j = k = 2;
		
		// Illegal, because only type of i is declared
	    // int i = j = k = 2;
		System.out.println(i + " " + j + " " + k);
	}

}
