package exceptionsdemo;
import java.time.*;
class ElectricityBill {
    private LocalDate dueDate;
    public ElectricityBill(LocalDate dueDate) { this.dueDate = dueDate; }
    public void pay(LocalDate payDate) throws LatePaymentException {
        if (payDate.isAfter(dueDate)) throw new LatePaymentException("Payment after due date");
        System.out.println("Payment accepted on " + payDate);
    }
}
public class ElectricityBillPaymentDemo {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(LocalDate.now().minusDays(1));
        try {
            bill.pay(LocalDate.now()); // triggers
        } catch (LatePaymentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
