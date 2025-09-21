package exceptionsdemo;
import java.util.Scanner;
class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) throw new InvalidMarksException("Marks must be 0..100");
        this.name = name;
        this.marks = marks;
    }
    public String toString() { return name + " -> " + marks; }
}
public class StudentMarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks: ");
        int m = Integer.parseInt(sc.nextLine());
        try {
            Student s = new Student(name, m);
            System.out.println("OK: " + s);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
