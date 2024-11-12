package polymorphism;

public class BlankFinalVariabl {

    final int speed;  // blank final variable

    /**
     * blank final variable can initialized in constructor only
     */
    public BlankFinalVariabl(int s) {
        this.speed = s;
        System.out.println("speeed is " + speed);
    }

    public static void main(String[] args) {
        BlankFinalVariabl blankFinalVariabl = new BlankFinalVariabl(10);
    }
}
