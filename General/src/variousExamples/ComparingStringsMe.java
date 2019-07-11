package variousExamples;

import java.util.*;

public class ComparingStringsMe {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
{
		char partyAffiliationCode;
		
		System.out.print("Enter Party Affiliation Code:");
		partyAffiliationCode = console.next().charAt(0);
		
		switch (partyAffiliationCode)
		{
		case 'D':
		case 'd':
				System.out.println("Democrat");
				break;
		case 'R':
		case 'r':	
				System.out.println("Republican");
				break;
		default: System.out.println("Independent");
		
		
		}
		
}
	
}
