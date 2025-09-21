package exceptionsdemo;
class ProductPriceValidator {
    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) throw new InvalidPriceException("Price must be positive");
        System.out.println("Price set: " + price);
    }
}
public class ProductPriceValidationDemo {
    public static void main(String[] args) {
        ProductPriceValidator v = new ProductPriceValidator();
        try {
            v.setPrice(0); // triggers
        } catch (InvalidPriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
