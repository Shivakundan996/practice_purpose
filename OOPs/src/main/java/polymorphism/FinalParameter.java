package polymorphism;

public class FinalParameter {
    /**
     * final paramter in method,again cannot be used to store values then C.T.E
     */
    static void cube(final int n){
//        int n = n+2; //can't be changed as final
        System.out.println(n);
    }

    public static void main(String[] args) {
        cube(6);
    }
}
