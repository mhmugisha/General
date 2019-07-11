/*This example illustrates the effect of the modifier "static" in
"public static int barcode" of  class Product. When it is added, 
the latest set value for the bar-code (in prod3) is set for all the preceding 
values. Irrespective of the bar-code setting in lines 13 and 16, the out put 
for all 3 lines of output will be 222. (222 three times.)*/

package instanceAndStaticVariables;

public class TestProduct {
	public static void main(String[] args) {
	
	Product prod1 = new Product();
    prod1.setBarcode(123);
    
    Product prod2 = new Product();
    prod2.setBarcode(999);
    
    Product prod3 = new Product();
    prod3.setBarcode(222);

    System.out.println(prod1.getBarcode());
    System.out.println(prod2.getBarcode());
    System.out.println(prod3.getBarcode());
	}

 }
