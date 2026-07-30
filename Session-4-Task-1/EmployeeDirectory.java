import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDirectory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> emp = new HashMap<>();

        emp.put(101, "Rahul");
        emp.put(102, "Anu");
        emp.put(103, "Kiran");

        System.out.println(emp);

        System.out.print("Enter Employee ID to Search: ");
        int id = sc.nextInt();

        if (emp.containsKey(id))
            System.out.println(emp.get(id));
        else
            System.out.println("Employee Not Found");

        System.out.print("Enter Employee ID to Update: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        emp.put(id, name);

        System.out.print("Enter Employee ID to Delete: ");
        id = sc.nextInt();

        emp.remove(id);

        System.out.println("Employee Details: " + emp);
    }
}