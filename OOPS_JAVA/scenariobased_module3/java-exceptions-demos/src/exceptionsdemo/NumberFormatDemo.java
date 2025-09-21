package exceptionsdemo;
import java.util.Scanner;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String str = sc.nextLine();
        try {
            int value = Integer.parseInt(str);
            System.out.println("You entered: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
