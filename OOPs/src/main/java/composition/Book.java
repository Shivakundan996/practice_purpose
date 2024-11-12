package composition;

/**
 * Composition : 1.composition is a design principle where one class contains one or more objects of other classes.
 * 2.This allows the class to use the functionality of the composed objects and delegate tasks to them.
 * 3.Composition is often preferred over inheritance because it promotes greater flexibility and modularity in the design.
 */
public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * if we don't override toString() then if we try to print the object of class ,
     * it prints address of heap memory
     * @return
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

