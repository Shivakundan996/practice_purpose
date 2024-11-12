package practice;

public class ClassCastException {

    public static void main(String[] args) {
        String str = "hello";
       // Integer s1= (Integer) s;   // this throws a classcastException

        // Check if str is an instance of Integer (which it won't be, so this block won't execute)
        /*if(str instanceof Integer){
        Integer num = (Integer) str;
        }
        else{
            System.out.println("cant be claas cast");
        }*/


        Object o = new Object();
        String s = new String();

        if(o instanceof String){
            s = (String) o;
        }else{
            System.out.println("cant be casted");
        }
        System.out.println(s);
    }
}
