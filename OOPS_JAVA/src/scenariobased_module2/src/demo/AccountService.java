package demo;
import java.lang.reflect.*;

public class AccountService {

    @Loggable(message="Creating account")
    public void createAccount(String owner) {
        System.out.println("Account created for " + owner);
    }

    @Loggable(message="Depositing funds")
    public void deposit(String owner, double amount) {
        System.out.println("Deposited " + amount + " to " + owner);
    }

    public static void invokeWithLogging(Object target, String methodName, Object... args) {
        try {
            Method chosen = null;
            for (Method m : target.getClass().getDeclaredMethods()) {
                if (m.getName().equals(methodName) && m.getParameterCount() == args.length) {
                    chosen = m; break;
                }
            }
            if (chosen == null) { System.out.println("[LOG] No such method: " + methodName); return; }

            Loggable log = chosen.getAnnotation(Loggable.class);
            if (log != null) {
                System.out.println("[LOG] " + log.message() + " -> " + chosen.getName());
            } else {
                System.out.println("[LOG] Invoking " + chosen.getName());
            }
            chosen.invoke(target, args);
        } catch (Exception e) {
            System.out.println("[LOG ERROR] " + e.getMessage());
        }
    }
}
