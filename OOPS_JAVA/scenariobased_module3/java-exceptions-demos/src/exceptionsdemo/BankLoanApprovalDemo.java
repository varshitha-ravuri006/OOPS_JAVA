package exceptionsdemo;
class Loan {
    public void approve(int creditScore) throws LowCreditScoreException {
        if (creditScore < 650) throw new LowCreditScoreException("Credit score below 650");
        System.out.println("Loan approved");
    }
}
public class BankLoanApprovalDemo {
    public static void main(String[] args) {
        Loan loan = new Loan();
        try {
            loan.approve(640); // triggers
        } catch (LowCreditScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
