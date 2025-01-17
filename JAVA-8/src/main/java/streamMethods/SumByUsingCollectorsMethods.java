package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*In the following example, we are using the Collectors class and its specified methods to
compute the sum of all the product prices.*/

public class SumByUsingCollectorsMethods {

	
	public static void main(String[] args) {
		 List < Product > productsList = new ArrayList < Product > ();
		 
	        //Adding Products  
	        productsList.add(new Product(1, "HP Laptop", 25000f));
	        productsList.add(new Product(2, "Dell Laptop", 30000f));
	        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
	        productsList.add(new Product(4, "Sony Laptop", 28000f));
	        productsList.add(new Product(5, "Apple Laptop", 90000f));
	        
	        // Using Collectors's method to sum the prices.  
		double sum = productsList.stream().
				collect(Collectors.summingDouble(p -> p.getPrice()));
		
		System.out.println(sum);
				
		
	}
}
