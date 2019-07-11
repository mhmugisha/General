//Program to Compute a finite sum.


package variousExamples;

import java.util.Scanner;

public class ComputingFiniteSum {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		System.out.println("Enter n: ");
		int n = console.nextInt();
		
		for (int i = 1; i<=n; i++)
			sum  += i; 				//or sum = sum + 1 
		System.out.println("Number entered: " + n);
		System.out.println("Sum of integers 0 - " + n + " is: " + sum);

	}

}
