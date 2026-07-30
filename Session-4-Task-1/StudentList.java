import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Anu");
        students.add("Kiran");
        students.add("Priya");

        System.out.println("Student List: " + students);

        System.out.print("Enter student name to search: ");
        String name = sc.nextLine();

        if (students.contains(name))
            System.out.println("Student Found");
        else
            System.out.println("Student Not Found");

        System.out.print("Enter student name to remove: ");
        name = sc.nextLine();

        students.remove(name);

        Collections.sort(students);

        System.out.println("Updated Student List: " + students);
    }
}