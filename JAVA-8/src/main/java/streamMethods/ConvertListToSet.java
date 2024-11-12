package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConvertListToSet {
	
	public static void main(String[] args) {
		
		List < Product > productsList = new ArrayList < Product > ();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        
        Set<Float> productSet = productsList.stream()
        		.filter(s -> s.getPrice() > 20000)
        		.map(p -> p.getPrice())
        		.collect(Collectors.toSet());
        
        productSet.forEach(s->System.out.println(s));
        
        int[] nums ={5,2,3,3,4,4,1};
        TreeSet<Integer> collect = (TreeSet<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.println("collectots is "+collect);

	}

}
