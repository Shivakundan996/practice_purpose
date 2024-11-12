package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOpeartions {

    private static long count;
	private static Set<Product> collect;

	public static void main(String[] args){
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        
        //counting price > 28000f
        count = productsList.stream().filter(x -> x.getPrice() >= 28000f).count();
        System.out.println(count);
        
//        collect = productsList.stream().distinct();      
        System.out.println(productsList.stream().distinct().count());
    }
}
