package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Filtering Collection by using Stream
public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// filtering data of list
		List<Float> productPriceList = productsList.stream().filter(p -> p.getPrice() > 25000f)
				.map(Product::getPrice)
				.collect(Collectors.toList());

		// displaying data
		productPriceList.forEach((price) -> System.out.println(price));

		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.getPrice() == 30000)
				.forEach(product -> System.out.println(product.getPrice()));

		// name conatins b letter
		List<Product> collect = productsList.stream().filter(p -> p.getName().startsWith("A"))
				.collect(Collectors.toList());	
		System.out.println(collect);
	}

}
