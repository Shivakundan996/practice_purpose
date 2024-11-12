package array_string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
       String s = "hhhelllo";
        Integer val=1;
       Map<Character,Integer> map = new HashMap<>();
       for (int i = 0 ;i<s.length();i++){
           char c = s.charAt(i);
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,val);
           }
       }
        System.out.println(map);

       int pow=1;
        for (int i = 1; i <=4; i++) {
            pow = pow*5;
        }
        System.out.println(pow);
    }


}
