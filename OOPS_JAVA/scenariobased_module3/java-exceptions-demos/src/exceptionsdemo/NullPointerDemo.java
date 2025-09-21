package exceptionsdemo;
import java.util.Scanner;
public class NullPointerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.print("Enter a string (or type NULL to simulate null): ");
        String input = sc.nextLine();
        if (!"NULL".equalsIgnoreCase(input)) s = input;
        try {
            int len = s.length();
            System.out.println("Length = " + len);
        } catch (NullPointerException e) {
            System.out.println("String is null; cannot get length.");
        }
    }
}
