import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
       Test345 test345 = new Test345();

       Integer a = 127;
       Integer b =127;
        System.out.println(a==b);

        Integer x = 127;
        Integer y = 127;
        System.out.println(x==y);

        //remove duplicates rom string
        String s = "krishnakris";
        removeduplicates(s);

//        List<String> list = new ArrayList<>();
//       list.add("A");
//       list.add("B");
//        System.out.println("before setting  this field:"+test345.getStrings());//memory
//       test345.setStrings(list);
//        System.out.println("after setting this field:"+test345.getStrings());//list
//        list.add("C");
//        System.out.println("after alteration :"+test345.getStrings());

        int[] array = {1, 2, 3, 4, 5};

        // Convert the int[] to a List<Integer> using IntStream.of()
        List<Integer> arrayList = IntStream.of(array)
                .boxed()
                .collect(Collectors.toList());


    }


    private static void removeduplicates(String s) {

        char[] charArray = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for(char i:charArray){
            set.add( i);
        }
        ArrayList<Character> list =new ArrayList<>(set);
        System.out.println(list);
    }




}
class Test345{
    List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
