package constructor;
public class ConstructorChaining {
    private int x;
    private int y;

    // Default constructor
    public ConstructorChaining() {
        this(0, 0); // Calls the constructor with two parameters
    }

    // Constructor with one parameter
    public ConstructorChaining(int x) {
        this(x, 0); // Calls the constructor with two parameters
    }

    // Constructor with two parameters
    public ConstructorChaining(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining(); // Calls default constructor
        ConstructorChaining obj2 = new ConstructorChaining(10); // Calls constructor with one parameter
        ConstructorChaining obj3 = new ConstructorChaining(10, 20); // Calls constructor with two parameters

        obj1.display(); // Output: x: 0, y: 0
        obj2.display(); // Output: x: 10, y: 0
        obj3.display(); // Output: x: 10, y: 20


        /*int a =10;
        long b=20;
        long l = a + b;
        System.out.println(a+b);*/


    }
}

