package variousExamples;

import java.util.Scanner;

public class AaPagesToGo {

	static Scanner console = new Scanner(System.in);
	static final double LAST_PAGE = 724;
	
	public static void main(String[] args) {
		
		double currentPage;
		double pagesToTheEnd;
		
		System.out.println("Enter Current Page: ");
		currentPage = console.nextDouble();
		
		pagesToTheEnd = LAST_PAGE - currentPage;
		
		System.out.println("Number of Pages to go: " + pagesToTheEnd);
		System.out.println();
		System.out.println("Percentage Covered: " + Math.round((currentPage/LAST_PAGE) * 100) + "%");
	}

}
