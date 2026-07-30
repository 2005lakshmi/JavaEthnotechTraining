abstract class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void performRole();

    void displayDetails() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    Student(String name) {
        super(name);
    }

    void performRole() {
        System.out.println("Student borrows books.");
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
    }
}

class Librarian extends Person {

    Librarian(String name) {
        super(name);
    }

    void performRole() {
        System.out.println("Librarian manages books.");
    }

    void displayDetails() {
        System.out.println("Librarian Name: " + name);
    }
}

class Book {

    private String bookName;

    Book(String name) {
        bookName = name;
    }

    public String getBookName() {
        return bookName;
    }
}

class Library {

    void addBook(Book b) {
        System.out.println(b.getBookName() + " added.");
    }

    void issueBook(Book b) {
        System.out.println(b.getBookName() + " issued.");
    }

    void returnBook(Book b) {
        System.out.println(b.getBookName() + " returned.");
    }

    void searchBook(Book b) {
        System.out.println(b.getBookName() + " found.");
    }

    void displayAvailableBooks(Book b) {
        System.out.println("Available Book: " + b.getBookName());
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Student s = new Student("Rahul");
        Librarian l = new Librarian("Anitha");

        Book b = new Book("Java Programming");

        Library lib = new Library();

        s.displayDetails();
        s.performRole();

        l.displayDetails();
        l.performRole();

        lib.addBook(b);
        lib.issueBook(b);
        lib.returnBook(b);
        lib.searchBook(b);
        lib.displayAvailableBooks(b);
    }
}