package exercises;

public class PopulationProjection {
	public static void main(String[] args) {
		System.out.println("Problem: The U.S. Census Bureau projects population based on the following assumptions:");
		System.out.println("- One birth every 7 seconds");
		System.out.println("- One death every 13 seconds");
		System.out.println("- One new immigrant every 45 seconds");
		System.out.println();
		System.out.println("Write a program to display the population for each of the next five years.");
		System.out.println("Assume the current population (in 2022) is 330 million , and one year has 365 days.");
		System.out.println();
		
		System.out.println("Solution: First we need to find the number of seconds in a year.");
		System.out.print("Seconds in a year = 365 x 24 x 60 x 60 = ");
		System.out.print(365 * 24 * 60 * 60);
		System.out.println(" seconds. ");
		System.out.println();
		
		System.out.println("Next we find the population for each of the next five year using the following formula: ");
		System.out.print("Population in year 1 (2023) = base population + (31536000 / 7) - (31536000 / 13) + (31536000 / 45) = ");
		System.out.println(330000000 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		System.out.print("Population in year 2 (2024) = population in year 1 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45) = ");
		System.out.println(332780096 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		System.out.print("Population in year 3 (2025)= population in year 2 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45) = ");
		System.out.println(335560192 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		System.out.print("Population in year 4 (2026)= population in year 3 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45) = ");
		System.out.println(338340288 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		System.out.print("Population in year 5 (2027) = population in year 4 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45) = ");
		System.out.println(341120384 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		
	}
	
}
