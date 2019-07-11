package variousExamples;

public class ForLoopSum {

	public static void main(String[] args) {
		
		
		for(int i =90; i<101; i++)
			{
			int sum = i;
			sum += i; 
			System.out.println(sum);
			
			}
		
		int n = 5;
		int p = 6;
		
		for(int i = 0; i!=10; i++) 
		{
			if(i<5)
				System.out.println(n);
			else
				System.out.println(p);
			
		}

	}

}
