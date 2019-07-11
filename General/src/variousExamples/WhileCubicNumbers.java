package variousExamples;

public class WhileCubicNumbers {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		int k = 1;

		if (i * i + j * j == k * k) {
			System.out.print(i);
			System.out.print(j);
			System.out.println(k);
			i++;
			j++;
			k++;
		}
	}

}
