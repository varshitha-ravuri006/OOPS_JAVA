package exceptionsdemo;
import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index (0-4): ");
            int idx = Integer.parseInt(sc.nextLine());
            System.out.println("Element = " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Array size is 5 (valid indices 0..4).");
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer index.");
        }
    }
}
