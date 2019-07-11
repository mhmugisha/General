package variousExamples;

import java.util.Scanner;

public class Practice1 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double inches, metres = 0;
		int counter;
		
		counter = 0;
		for(inches = 1; inches<=144; inches++) {
			metres = inches/39.37;
		System.out.println(inches + " inches is " +(metres) + " metres");
		
		counter++;
		if(counter==12)
		{
			System.out.println();
			counter = 0;
		}
	  }
	}
	
}
	
