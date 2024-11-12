package streamMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		//sorting the price
		// o1- o2 for ascending
		// 02 - o1 for descending
		List<Product> collect = productsList.stream().
				sorted((o1, o2) -> (int)(o1.getPrice() - o2.getPrice()))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		//2nd type to sort in reversed
		
		List<Float> collect2 = productsList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).map(e -> e.getPrice()).collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
