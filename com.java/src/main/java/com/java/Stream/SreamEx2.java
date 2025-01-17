package com.java.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Comparator;

public class SreamEx2 {
	
	public static void main(String[] args) {
		   List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        
	        
	        //mapiing price above 30,000
	        
	        List<Float> productPriceList2 =productsList.stream()  
	                                     .filter(p -> p.price > 30000)// filtering data  
	                                     .map(p->p.price)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list 
	        

	        //sorting the price in product using method reference for collections
	        Collections.sort(productsList, Comparator.comparing(Product::getPrice));
	        
	        
	        System.out.println(productPriceList2);  
	}

}
