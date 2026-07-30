import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private String course;
    private int marks;

    public void setStudentId(int id) {
        studentId = id;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setCourse(String c) {
        course = c;
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100)
            marks = m;
        else
            System.out.println("Invalid Marks");
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Student ID : " + getStudentId());
        System.out.println("Student Name : " + getStudentName());
        System.out.println("Course : " + getCourse());
        System.out.println("Marks : " + getMarks());
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student ID: ");
        s.setStudentId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        s.setStudentName(sc.nextLine());

        System.out.print("Enter Course: ");
        s.setCourse(sc.nextLine());

        System.out.print("Enter Marks: ");
        s.setMarks(sc.nextInt());

        System.out.println("\nStudent Details");
        s.display();
    }
}