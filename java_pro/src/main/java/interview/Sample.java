package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,9,4,7,3);
        list.stream().sorted().collect(Collectors.toList());
        List<Integer> collect = list.stream().filter(x-> x%2==0).collect(Collectors.toList());

        System.out.println(collect);

        Sample sample = new Sample();
        System.out.println(sample);
        System.out.println(sample.hashCode());

        /*String s = new String();
        System.out.println(s);*/

        String s1 ="hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s3);
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
    }

}
