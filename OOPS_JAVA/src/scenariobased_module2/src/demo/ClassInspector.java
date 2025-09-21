package demo;
import java.lang.reflect.*;

public class ClassInspector {
    public static void main(String[] args) throws Exception {
        String target = (args.length > 0) ? args[0] : "demo.Product";
        Class<?> c = Class.forName(target);

        System.out.println("Inspecting: " + c.getName());
        System.out.println("-- Fields --");
        for (Field f : c.getDeclaredFields()) {
            System.out.println("  " + f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("-- Methods --");
        for (Method m : c.getDeclaredMethods()) {
            System.out.print("  " + m.getReturnType().getSimpleName() + " " + m.getName() + "(");
            Class<?>[] pts = m.getParameterTypes();
            for (int i = 0; i < pts.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(pts[i].getSimpleName());
            }
            System.out.println(")");
        }

        System.out.println("\nReflection enables runtime introspection by allowing your program to load classes by name," +
                " discover their fields and methods, and invoke them dynamically—useful for debugging, logging," +
                " dependency injection, plugins, and testing frameworks.");
    }
}
