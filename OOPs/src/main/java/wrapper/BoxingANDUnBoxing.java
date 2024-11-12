package wrapper;
public class BoxingANDUnBoxing {
    public static void main(String[] args) {

        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
        System.out.println(a+" "+i+" "+j);

        //Converting Integer to int
        Integer b=3;
        int k=b.intValue();//converting Integer to int explicitly
        int l=b;//unboxing, now compiler will write a.intValue() internally
        System.out.println(b+" "+k+" "+l);

        Integer z=40;
        double y = z.doubleValue(); //converting Integer to double primitve value
        double f=z;//converting Integer to double primitve value
        Double x= Double.valueOf(z);//convertinf Intger to Double
        System.out.println(y);

        Double u = 50d;
        Integer v =Integer.valueOf(String.valueOf(u)); //converting Double to Integer
        int w = u.intValue();//converting Double to int primtive
        int g=(int)u.doubleValue(); //converting Double to int primitve

        
        String s ="zero  ";
        System.out.println(s.trim());





    }
}
