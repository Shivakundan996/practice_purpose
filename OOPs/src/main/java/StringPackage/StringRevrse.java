package StringPackage;

public class StringRevrse {
    public static void main(String[] args) {
        StringRevrse stringRevrse = new StringRevrse();
        String s = "Hello world!";
        System.out.println(stringRevrse.reverse(s));
    }

    String reverse(String s){
        String[] arr = s.split("\\s");
        String s1="";
        for (String i:arr){
            StringBuilder sb = new StringBuilder(i);
            s1=s1+" "+sb.reverse().toString();


        }
        return s1.trim();
    }
}
