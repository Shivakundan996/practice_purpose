package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RemoveDuplicates {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1 ,2 ,7 ,4 ,5 ,6);

        int m = 3;
        List<Integer> collect = list.stream().skip(m).collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);
        
        int j=0;
        for (int i = m +1; i < list.size(); i++) {
            list.set(i, collect.get(j++));
        }
        System.out.println(list);


    }
}