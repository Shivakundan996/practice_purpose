package com.java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
	
	public static void main(String[] args) {
		List<Integer> list1=List.of(1,5,4,8,3);
		
		List<Integer> list2=Arrays.asList(9,2,4,8,4);
		
		//using stream filter and collecting it to another list
		List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
	}
	
	
}
