package practice.purpose;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * merge two sorted or unsorted arrays into single sorted array without duplicates
 * @author shivakundan.pr
 *
 */

public class MergedArrayWithNoDuplicates {

	public static void main(String[] args) {
		
		  int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
          
	        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
	        
	        List<Integer> list = new ArrayList<>();
	        for(Integer i: arrayA) {
	        	list.add(i);
	        }
	        for(Integer i: arrayB) {
	        	list.add(i);
	        }
	        
	        System.out.println("merged items with duplicates"+list);
	        
	        Set<Object> set = new HashSet<>(/*list*/);
	        
	        //filtering disticnt values
	        Collection<Integer> collect = list.stream().filter(i-> !set.add(i)).collect(Collectors.toCollection(ArrayList::new));
	        
	        //unique elements using distinct() method in streams
	        Map<Integer, Long> collect2 = list.stream().distinct().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	        
	        System.err.println("using distict to hasmap"+collect2);
	        System.out.println("usinf collection unique elements:"+collect);
	        System.out.println("merged items with no duplicates "+set);
	        
	        
	}

}
