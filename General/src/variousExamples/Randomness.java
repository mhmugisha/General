package variousExamples;
import java.util.Random;
public class Randomness {
	public static void main() {
		
		Random r = new Random();

		int x = 1 + r.nextInt(10);//Picks a random No. from 1 to 10 (inc). nextInt(10) alone does not inc 1 
		System.out.println( "My random number is " + x );

		System.out.println( "Some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Some numbers from 1 to 100!");
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
			{System.out.println("Random nos same! Weird." );}
		if ( num1 != num2 )
		{System.out.println("Random nos diff.! No wonder. ");}
	}
}