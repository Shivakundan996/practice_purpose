package interview;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class RemoveConsecutive {
    public static String removeConsecutive(StringBuilder str) {

        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                s = s + str.charAt(i);
            }
        }
        s = s + str.charAt(str.length() - 1);
        return s;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("xxxyyyzwwzzz");
        System.out.println(removeConsecutive(str));
        
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String format1 = format.format(date);
        System.out.println();
        System.out.println(format1);
        LocalDate localDate =LocalDate.now();
        /**System.out.println(date+" "+localDate);
        System.out.println(LocalTime.now());*/

    }
}
