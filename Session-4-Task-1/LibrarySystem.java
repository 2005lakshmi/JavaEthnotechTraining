import java.util.HashSet;

public class LibrarySystem {
    public static void main(String[] args) {

        HashSet<String> books = new HashSet<>();

        books.add("Java");
        books.add("Python");
        books.add("C");
        books.add("Java");
        books.add("Python");

        System.out.println("Books: " + books);

        System.out.println("Total Books: " + books.size());
    }
}