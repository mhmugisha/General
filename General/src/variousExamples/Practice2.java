package variousExamples;

import java.util.*;

public class Practice2 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double Age;
		
		System.out.println("Enter Age:");
		Age = console.nextDouble();
		
		if (Age>18) {
			System.out.println("Eligible to vote.");
			System.out.println("No longer a minor.");
		}
		else {
			System.out.println("Not eligible to vote.");
			System.out.println("Still a minor.");
		}
	}
}
