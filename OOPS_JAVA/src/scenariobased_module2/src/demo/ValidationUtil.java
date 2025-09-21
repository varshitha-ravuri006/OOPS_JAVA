package demo;
import java.lang.reflect.*;

public class ValidationUtil {
    public static void validate(Object obj) {
        Class<?> c = obj.getClass();
        for (Field f : c.getDeclaredFields()) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                try {
                    f.setAccessible(true);
                    Object val = f.get(obj);
                    if (val == null || val.toString().trim().isEmpty()) {
                        System.out.println("[VALIDATION WARNING] Field '" + f.getName() + "' in " + c.getSimpleName() + " must not be empty");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("[VALIDATION ERROR] " + e.getMessage());
                }
            }
        }
    }
}
