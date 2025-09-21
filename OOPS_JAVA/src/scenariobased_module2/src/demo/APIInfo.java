package demo;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface APIInfo {
    String endpoint();
    String method();
}
