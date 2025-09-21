package exceptionsdemo;
import java.util.Scanner;
class ShoppingCart {
    private int stock;
    public ShoppingCart(int stock) { this.stock = stock; }
    public void purchase(int qty) throws OutOfStockException {
        if (qty > stock) throw new OutOfStockException("Only " + stock + " in stock");
        stock -= qty;
    }
}
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qty to purchase: ");
        int q = Integer.parseInt(sc.nextLine());
        try {
            cart.purchase(q);
            System.out.println("Purchased " + q + " item(s).");
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
