package demo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("== Reflection: load/instantiate/invoke ==");
        ReflectionLoadInvoke.main(new String[0]);

        System.out.println("\n== APIDescription demo ==");
        APIDescriptionReader.main(new String[0]);

        System.out.println("\n== APIInfo endpoints ==");
        APIInfoScanner.main(new String[0]);

        System.out.println("\n== Class Inspector (demo.Product) ==");
        ClassInspector.main(new String[] {"demo.Product"});

        System.out.println("\n== Validation (@NotEmpty) ==");
        ValidationRunner.main(new String[0]);

        System.out.println("\n== Role-Based Access ==");
        AccessControlDemo.main(new String[0]);

        System.out.println("\n== Logging Metadata ==");
        LoggingDemo.main(new String[0]);

        System.out.println("\n== Version Tracking ==");
        VersionReader.main(new String[0]);

        System.out.println("\n== Mini Test Framework ==");
        MiniTestRunner.main(new String[0]);
    }
}
