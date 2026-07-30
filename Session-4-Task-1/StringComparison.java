import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase() : " + s1.equalsIgnoreCase(s2));
        System.out.println("Using compareTo() : " + s1.compareTo(s2));
    }
}