package demo;

public class LoggingDemo {
    public static void main(String[] args) {
        AccountService svc = new AccountService();
        AccountService.invokeWithLogging(svc, "createAccount", "Ramesh");
        AccountService.invokeWithLogging(svc, "deposit", "Ramesh", 2500.0);
    }
}
