package exceptionsdemo;
import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double balance) { this.balance = balance; }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        balance -= amount;
    }
    public double getBalance() { return balance; }
}
public class BankWithdrawalDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Withdraw amount: ");
        double amt = Double.parseDouble(sc.nextLine());
        try {
            acc.withdraw(amt);
            System.out.println("Withdrawal successful. Balance: " + acc.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
