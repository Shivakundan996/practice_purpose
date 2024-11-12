package interview;

import java.util.Arrays;

public class ArrayStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string = String.join("",word1);
        String string1 = String.join("",word2);
        System.out.println(string);
        return string.equals(string1);

    }

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};

        System.out.println((arrayStringsAreEqual(word1,word2)));
    }

}
