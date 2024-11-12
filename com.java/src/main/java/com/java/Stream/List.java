package com.java.Stream;
import java.util.*;

import com.java.Stream.List;

public class List {
	public static void main(String[] args) {
		 java.util.List<String> stringList = Arrays.asList("1", "2", "2", "3", "4");
	        Map<String, java.util.List<String>> map = new HashMap();

	        java.util.List<String> stringList1 = new ArrayList<>();
	        for (String s : stringList) {
	       if (map.containsKey(s)) {
	           java.util.List<String> strings = map.get(s);
	           if (strings.contains(s)) {
	               stringList1.add(s);
	           }

	       }else {
	           stringList1.add(s);
	           map.put(s, stringList1);
	       }
	        }
	        System.out.println("stringList : "+stringList1);
		
		
	

}
}