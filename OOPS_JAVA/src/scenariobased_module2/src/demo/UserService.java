package demo;
import java.lang.reflect.*;

public class UserService {
    @RoleAllowed(role="ADMIN")
    public void deleteUser(String userId) {
        System.out.println("User " + userId + " deleted.");
    }

    @RoleAllowed(role="USER")
    public void viewDashboard() {
        System.out.println("Dashboard viewed.");
    }

    public static void invokeIfAllowed(Object target, String methodName, String role, Class<?>... paramTypes) {
        try {
            Method m = target.getClass().getDeclaredMethod(methodName, paramTypes);
            RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
            if (ra != null && !ra.role().equalsIgnoreCase(role)) {
                System.out.println("[ACCESS DENIED] Method " + methodName + " requires role " + ra.role() + ", but current role is " + role);
                return;
            }
            if (paramTypes.length == 0) {
                m.invoke(target);
            } else {
                m.invoke(target, "U1001");
            }
        } catch (Exception e) {
            System.out.println("[ACCESS ERROR] " + e.getMessage());
        }
    }
}
