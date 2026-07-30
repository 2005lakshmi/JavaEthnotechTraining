class Person {
    String name = "Rahul";
}

class Student extends Person {
    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}

class Faculty extends Person {
    void displayFaculty() {
        System.out.println("Faculty Name: " + name);
    }
}

class Admin extends Person {
    void displayAdmin() {
        System.out.println("Admin Name: " + name);
    }
}

public class CollegeManagement {
    public static void main(String[] args) {

        Student s = new Student();
        Faculty f = new Faculty();
        Admin a = new Admin();

        s.displayStudent();
        f.displayFaculty();
        a.displayAdmin();
    }
}