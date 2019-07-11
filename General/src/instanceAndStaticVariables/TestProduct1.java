package instanceAndStaticVariables;

public class TestProduct1 {

	public static void main(String[] args) 
	{
		Product1 item1 = new Product1();
        item1.barcode = 123456;		//123456 belongs only to instance item1.

        Product1 prod2 = new Product1();
        prod2.barcode = 987654;		//987654 belongs only to instance prod2.

        System.out.println(item1.barcode);
        System.out.println(prod2.barcode);
	}
	
	
}


