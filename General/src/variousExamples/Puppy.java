/* This is an example of creating a constructor and using it 
 * to create an object myPuppy.
 */
//Not yet clear is whether I can create an object within my class 
//(one without the method main). 

package variousExamples;

public class Puppy 
{
		 public Puppy(String name)//Constructor with one parameter, name. 
		 {
		      
		      System.out.println("Passed Name is :" + name );
		 }

		   public static void main(String []args) 
		 {
		      // Following statement would create an object myPuppy
		      Puppy myPuppy = new Puppy( "Tommy" );
		 }

}
