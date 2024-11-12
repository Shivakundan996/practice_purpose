package collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;



/**
 * Collectors is one of the utility class in JDK which contains a lot of utility functions.
 *  It is mostly used with Stream API as a final step. In this article, 
 *  we will study different methods in the collector class.
 * @author shivakundan.pr
 *
 */
public class CollectorsExample {

	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));
	        
	        //comparator reversed order
	        Collections.sort(productsList,Comparator.comparing(Product::getName).reversed());
	        productsList.stream().forEach(x -> System.out.println(x.getName()));
	       
	        
	        // summingDouble()
	        Double rava = productsList.stream().
	        		collect(Collectors.summingDouble(x -> x.price));
	        System.out.println(rava);
	        
	       
	        //summingInt() - summing the all id's in product
	       Integer sumId =   
	                productsList.stream().collect(Collectors.summingInt(x->x.id));  
	        System.out.println("Sum of id's: "+sumId);  
	        
	        //counting() elements - counting number of elements in product
	        Long noOfElements = productsList.stream()
	                .collect(Collectors.counting());
	        System.out.println(noOfElements);
	        
	        //averagingDouble() - getting averge of product price
	        Double average = productsList.stream()  
                    .collect(Collectors.averagingDouble(p->p.price));  
	        System.out.println("Average price is: "+average); 
	        
	        //toCollection() - Collect directly into a TreeSet using Collectors.toCollection
	        int[] nums = {4, 2, 3, 1, 5};
	        TreeSet<Integer> collect = Arrays.stream(nums)
	                                         .boxed() //boxed(): Converts the IntStream to a Stream<Integer>.
	                                         .collect(Collectors.toCollection(TreeSet::new));
	        System.out.println("to collection is: "+collect);
	        
	        
	        

	}
}
