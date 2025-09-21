package exceptionsdemo;
import java.util.Scanner;
class MobileRecharge {
    public void recharge(int amount) throws MinimumRechargeException {
        if (amount < 10) throw new MinimumRechargeException("Minimum recharge is ₹10");
        System.out.println("Recharged ₹" + amount);
    }
}
public class MobileRechargeDemo {
    public static void main(String[] args) {
        MobileRecharge mr = new MobileRecharge();
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        int amt = Integer.parseInt(sc.nextLine());
        try {
            mr.recharge(amt);
        } catch (MinimumRechargeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
