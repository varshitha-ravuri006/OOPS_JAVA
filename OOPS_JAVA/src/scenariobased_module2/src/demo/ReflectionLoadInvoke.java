package demo;
import java.lang.reflect.*;

public class ReflectionLoadInvoke {
    public static void main(String[] args) throws Exception {
        String className = "demo.Product";
        Class<?> clazz = Class.forName(className);

        Object product = clazz.getDeclaredConstructor().newInstance();

        Method m = clazz.getDeclaredMethod("showDetails");
        m.invoke(product);

        System.out.println("-- Also instantiate with params --");
        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class, double.class);
        Object p2 = ctor.newInstance("Notebook", 7.49);
        m.invoke(p2);
    }
}
