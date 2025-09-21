package exceptionsdemo;
import java.util.*;
class Ecommerce {
    public void placeOrder(List<String> items) throws EmptyCartException {
        if (items == null || items.isEmpty()) throw new EmptyCartException("Cart is empty");
        System.out.println("Order placed for " + items);
    }
}
public class ShoppingCartEmptyDemo {
    public static void main(String[] args) {
        Ecommerce e = new Ecommerce();
        try {
            e.placeOrder(Collections.emptyList()); // triggers
        } catch (EmptyCartException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
