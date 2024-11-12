package constructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,39,39,4,7);
       /* for(int i: list){

        }*/
        Collections.sort(list);
        list.stream().forEach(integer -> System.out.print(integer+" "));
    }
}
