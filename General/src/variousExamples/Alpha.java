package variousExamples;

import java.util.*;

public class Alpha {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int alpha;
		
		System.out.print("Enter Alpha: " );
		alpha = console.nextInt();
		
		switch (alpha)
		{
		case 1:
		case 2:
			System.out.println(alpha = alpha + 2);
			break;
		case 4:
			System.out.println(alpha++);
		case 5:
			System.out.println(alpha = 2 * alpha);
		case 6:
			System.out.println(alpha = alpha + 5);
			break;
		default:
			System.out.println(alpha = alpha--);
			
			}
		
	
	}
}
