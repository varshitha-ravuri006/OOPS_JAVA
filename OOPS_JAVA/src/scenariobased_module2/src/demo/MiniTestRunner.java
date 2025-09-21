package demo;
import java.lang.reflect.*;

public class MiniTestRunner {
    public static void main(String[] args) throws Exception {
        Class<?> c = CalculatorTest.class;
        Object testInstance = c.getDeclaredConstructor().newInstance();
        int passed = 0, failed = 0;

        for (Method m : c.getDeclaredMethods()) {
            if (m.isAnnotationPresent(TestCase.class) && m.getParameterCount() == 0) {
                try {
                    m.invoke(testInstance);
                    System.out.println("[PASS] " + m.getName());
                    passed++;
                } catch (Throwable t) {
                    System.out.println("[FAIL] " + m.getName() + " -> " + t.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Summary: %d passed, %d failed%n", passed, failed);
    }
}
