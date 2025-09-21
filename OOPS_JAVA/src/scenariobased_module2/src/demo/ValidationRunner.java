package demo;

public class ValidationRunner {
    public static void main(String[] args) {
        Customer a = new Customer("", "a@x.com");
        Customer b = new Customer("Alice", "alice@x.com");
        ValidationUtil.validate(a);
        ValidationUtil.validate(b);
    }
}
