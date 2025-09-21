package demo;
import java.lang.reflect.*;

public class APIInfoScanner {
    public static void main(String[] args) {
        Class<?> c = UserAPI.class;
        System.out.println("Available API Endpoints:");
        for (Method m : c.getDeclaredMethods()) {
            APIInfo info = m.getAnnotation(APIInfo.class);
            if (info != null) {
                System.out.printf(" - %-20s %s%n", info.method(), info.endpoint());
            }
        }
    }
}
