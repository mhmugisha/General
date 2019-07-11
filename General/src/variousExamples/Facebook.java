package variousExamples;

import java.util.Scanner;

public class Facebook {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//System.out.println(randomArray(2));
		int numValues = 8;
		int[] array = randomArray(numValues);
		
		printArray(array);
	}
	public static int[] randomArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i<a.length; i++) {
		a[i] = (int)Math.random();
		}
		return a;
	
	}	
	public static void printArray(int[] a) {
		for (int i = 0; i<a.length; i++) {
		System.out.print(a[i]);
		}
		}
}
