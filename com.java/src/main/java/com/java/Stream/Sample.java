package com.java.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Sample {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("1", "2", "2", "3", "4");
        Map<String, List<String>> map = new HashMap();

        List<String> stringList1 = new ArrayList<>();
        for (String s : stringList) {
       if (map.containsKey(s)) {
           List<String> strings = map.get(s);
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
 

