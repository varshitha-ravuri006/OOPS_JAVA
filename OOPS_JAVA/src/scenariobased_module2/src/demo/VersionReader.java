package demo;

public class VersionReader {
    public static void main(String[] args) {
        Class<?> c = ReportGenerator.class;
        if (c.isAnnotationPresent(Version.class)) {
            Version v = c.getAnnotation(Version.class);
            System.out.println("ReportGenerator version: " + v.number());
        } else {
            System.out.println("No version found.");
        }
    }
}
