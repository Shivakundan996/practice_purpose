package constructor;

public class Child extends Parent {
    public Child() {
//        super(); // Calls the default constructor of the superclass
        System.out.println("Child class default constructor");
    }


    public Child(int x) {
        /**
         * if we don't use super() keyword,it automatically calls default constructor here
         */
//        super(x); // Calls the superclass constructor with one parameter
        System.out.println("Child class constructor with parameter: " + x);
    }

    public static void main(String[] args) {
        Child child1 = new Child(); // Calls default constructor
        Child child2 = new Child(10); // Calls constructor with one parameter
    }
}
