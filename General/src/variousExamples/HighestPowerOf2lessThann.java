
//Computes and prints the largest power of 2
// less than n.

package variousExamples;

import java.util.Scanner;

public class HighestPowerOf2lessThann {

	static Scanner console = new Scanner(System.in);
	
	public  static void main(String[] args) {
		
		int power = 1;
		int n;
		
		System.out.println("Enter n: ");
		n = console.nextInt();
				
		while (power<= n/2)
			  power = 2*power;
			
			System.out.println("The number you entered is: " + n);
			System.out.println("The largest power of 2 less than " + n + " is: " + power);
		}
}
	
	

