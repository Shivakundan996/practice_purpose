package polymorphism;

public class StaticBlankFinalvariable {

    static final int speed ;  //static blank final variable

    /**
     *static blank final variable should be initialized only in static block
     */
    static {speed=100;}

    public static void main(String[] args) {
        System.out.println(StaticBlankFinalvariable.speed);
    }
}
