//Computes the finite product of integers from 1 to n
// n factorial, n!.


package variousExamples;

import java.util.Scanner;

public class FiniteProductOneToanyInteger {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		int product = 1;
		int n;
		
		System.out.println("Enter n: ");
		n = console.nextInt();
		
		for (int i=1; i<=n; i++)
			product *= i;
		
		System.out.println("Starting with " + n + " the product is: " +"\n" + n);
		
		for(int i = 1; i<n; i++)
		{
			System.out.print("x " + i + " ");
		}
		System.out.println();
		
		
		System.out.println("Finite product of integers " + n + " to 1 is: " + product);
		
	}
	
	
}
