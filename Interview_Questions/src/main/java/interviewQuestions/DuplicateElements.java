package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 	How to find duplicate elements in a Stream in Java
 * 	Input : [1,2,3,4,2,5,4]
   	output: [2,4]*/
public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,2,5,4);
		Set<Integer> set= new HashSet();
	 Set<Integer> collect = list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
	 
		System.out.println(collect);
		
		
		
	}

}
