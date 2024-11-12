package Math;

public class MathOperations {
    public static void main(String[] args) {
        double v = Math.random() * 10;
        System.out.println(v);
        System.out.println(Math.ceil(v));
        System.out.println(Math.round(v));

        /**
         * The java.lang.Math.incrementExact() returns the argument incremented by one.
         * It will throw an exception if the result overflows either int or long
         */
        int a = -674;
        System.out.println("increemented value of a: "+Math.incrementExact(a));

        int b= Integer.MAX_VALUE;
        // Input integer overflow, Output ArithmeticException
        System.out.println(Math.incrementExact(b));

    }
}
