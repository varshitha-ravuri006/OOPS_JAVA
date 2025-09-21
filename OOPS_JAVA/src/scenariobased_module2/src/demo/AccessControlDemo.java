package demo;

public class AccessControlDemo {
    public static void main(String[] args) {
        UserService svc = new UserService();
        String currentRole = "USER";

        UserService.invokeIfAllowed(svc, "viewDashboard", currentRole);
        UserService.invokeIfAllowed(svc, "deleteUser", currentRole, String.class);

        System.out.println("-- Elevating role to ADMIN --");
        currentRole = "ADMIN";
        UserService.invokeIfAllowed(svc, "deleteUser", currentRole, String.class);
    }
}
