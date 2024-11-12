package practice.purpose;

@SuppressWarnings("removal")
public class BoxingExample {
    private static Integer k;

    public static void main(String[] args) {
        Integer i = new Integer(10);
        
		Integer j = new Integer(10);
        k = new Integer(i+ j);
        System.out.println(i==j);   //so here it is checking for the refernece in heap memory
        System.out.println(i.equals(j)); ///it will check for the whether values equal or not
        System.out.println("Output: "+ k);
    }
}
