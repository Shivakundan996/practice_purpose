package ExceptionClass;

/**
 * throw keyword - it used to explicitly throw the custom class exception,
 * throws - used to declare an exception at the method level
 */
public class TestClass {
    public static void main(String[] args) {

        int age =17;
        try{
            if(age<18){
            throw new ArithmeticException("age is leass than 18");
            }
        } catch (ArithmeticException e) {
            System.out.println("unchecked exception........");
        }
    }

    void m(){
        System.out.println("hello");
    }
}
