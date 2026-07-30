import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double salary;

    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void getDeveloperDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Programming Language: ");
        programmingLanguage = sc.nextLine();
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.getEmployeeDetails();
        d.getDeveloperDetails();

        System.out.println("\nDeveloper Details");
        d.displayDeveloper();
    }
}