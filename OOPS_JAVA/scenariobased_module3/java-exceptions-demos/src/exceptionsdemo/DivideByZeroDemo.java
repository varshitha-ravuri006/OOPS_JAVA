package exceptionsdemo;
import java.util.Scanner;
public class DivideByZeroDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Enter denominator: ");
            double b = Double.parseDouble(sc.nextLine());
            if (b == 0) throw new ArithmeticException("Denominator cannot be zero");
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }
}
