package demo;
import java.lang.reflect.*;

public class APIDescriptionReader {
    public static void main(String[] args) throws Exception {
        Class<?> c = DocExampleOrg.class;

        if (c.isAnnotationPresent(APIDescription.class)) {
            APIDescription a = c.getAnnotation(APIDescription.class);
            System.out.println("Class Description: " + a.description());
        }

        for (Method m : c.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                APIDescription a = m.getAnnotation(APIDescription.class);
                System.out.println("Method " + m.getName() + " -> " + a.description());
            }
        }
    }
}
