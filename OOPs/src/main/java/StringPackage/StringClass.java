package StringPackage;

import java.util.StringJoiner;

public class StringClass {

    public static void main(String[] args) {
        StringClass stringClass= new StringClass();
        stringClass.roundof();
        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

        String s4= String.join(" ",s1,s2);
        System.out.println(s4);
        StringJoiner s5;

        //remove chafr at specified index
        StringBuffer sb = new StringBuffer(s2);
        System.out.println(sb.deleteCharAt(2));

        String str = "shiva";
        String str2 = new String("shiva");
        System.out.println(str==str2);
        str.concat("kundan");
        System.out.println("my name is "+str);
        StringBuffer sb1 = new StringBuffer("jeeva");
        sb1.append("aditya");
        System.out.println("his name is "+sb1);





    }

     public Object roundof() {
        double i = 1320.10;
        try {
            double number = Double.parseDouble(String.valueOf(i));
            System.out.println(Math.round(number / 100));
            return Math.round(number / 100);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
}
