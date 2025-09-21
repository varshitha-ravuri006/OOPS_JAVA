package exceptionsdemo;
import java.util.Scanner;
class ATM {
    public void withdraw(double amount) throws LimitExceededException {
        if (amount > 20000) throw new LimitExceededException("Per-transaction limit is ₹20,000");
        System.out.println("Dispensed: ₹" + amount);
    }
}
public class ATMDailyLimitDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Withdraw amount: ");
        double amt = Double.parseDouble(sc.nextLine());
        try {
            atm.withdraw(amt);
        } catch (LimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
