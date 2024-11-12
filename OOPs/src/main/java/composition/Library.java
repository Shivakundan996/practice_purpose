package composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Composition : 1.composition is a design principle where one class contains one or more objects of other classes.
 * 2.This allows the class to use the functionality of the composed objects and delegate tasks to them.
 * 3.Composition is often preferred over inheritance because it promotes greater flexibility and modularity in the design.
 */

public class Library {

    static Book book1 = new Book("bhoomika","kushi");
    static Book book2 = new Book("katrina","mallishwari");

    static List<Book> book = new ArrayList<>(Arrays.asList(book1,book2));

    public static void main(String[] args) {
        for (Book books:book) {
            System.out.println(books);
        }
        final int[] a = new int[7];
        a[0] = 8;
        System.out.println(Arrays.toString(a));

    }


}
