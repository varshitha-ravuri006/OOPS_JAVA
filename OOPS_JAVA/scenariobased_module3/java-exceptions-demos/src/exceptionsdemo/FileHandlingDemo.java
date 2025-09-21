package exceptionsdemo;
import java.io.*;
public class FileHandlingDemo {
    public static void main(String[] args) {
        String path = "sample.txt"; // place a sample.txt near where you run
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
