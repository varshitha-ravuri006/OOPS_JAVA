package exceptionsdemo;
class BankAccount2 {
    private double balance;
    public BankAccount2(double initial) throws MinimumBalanceException {
        if (initial < 1000) throw new MinimumBalanceException("Initial deposit must be >= ₹1000");
        this.balance = initial;
    }
    public String toString() { return "BankAccount2{balance=" + balance + "}"; }
}
public class BankAccountCreationDemo {
    public static void main(String[] args) {
        try {
            BankAccount2 acc = new BankAccount2(500); // triggers
            System.out.println(acc);
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
