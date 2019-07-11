package variousExamples;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter number to reverse: ");

		int Number = console.nextInt();
		int Copy = Number; 
		
		int Reverse = 0;
		int Remainder = 0;
		
		while (Number  > 0) {
			Remainder = Number % 10;
			Reverse = Reverse*10 + Remainder;
			Number = Number / 10;
		}
		if(Copy==Reverse)
		System.out.println("The number is a Palindrome" );
		else
			System.out.println("The number is not a palindrome.");
		
	}

}
