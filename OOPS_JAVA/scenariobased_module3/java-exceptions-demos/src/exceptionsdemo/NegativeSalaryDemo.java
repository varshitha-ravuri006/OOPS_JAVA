package exceptionsdemo;
import java.util.Scanner;
class Employee {
    private double salary;
    public Employee(double salary) throws InvalidSalaryException {
        if (salary < 0) throw new InvalidSalaryException("Salary cannot be negative");
        this.salary = salary;
    }
    public String toString() { return "Employee{salary=" + salary + "}"; }
}
public class NegativeSalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double s = Double.parseDouble(sc.nextLine());
        try {
            Employee e = new Employee(s);
            System.out.println(e);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
