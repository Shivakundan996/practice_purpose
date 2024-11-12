package streamMethods;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  flatMap() is the combination of a map and a flat operation 
 *  i.e. it first applies map function and than flattens the result.
 */
public class FlatMap {

	public static void main(String[] args) {
	
		 // 1st example
        // adding the elements to number arraylist
		List<List<Integer> > number = new ArrayList<>();
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println(number);
        List<Integer> collect = number.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect);
        
        
        // 2nd example
        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Geeks", "For"),
            Arrays.asList("GeeksForGeeks", "A computer portal"),
            Arrays.asList("Java", "Programming")
        );
        // Using Stream flatMap(Function mapper)
        listOfLists.stream()
                   .flatMap(list -> list.stream())
                   .forEach(System.out::println);
    
	}
}
