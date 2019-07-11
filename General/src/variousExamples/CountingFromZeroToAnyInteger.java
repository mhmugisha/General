//program that gets an integer from the user. Counts from 0 to that integer. 
//Using a for loop.


package variousExamples;

import java.util.Scanner;

public class CountingFromZeroToAnyInteger {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int x;
		int i;
		
		System.out.print("Enter any + ve integer:");
		x = console.nextInt();
		
		for(i=1; i<=x; i++)
			System.out.print(" " + i);
	}
	
		
}
