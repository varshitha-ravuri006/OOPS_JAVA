package exceptionsdemo;
class TemperatureSensor {
    public void read(double celsius) throws TemperatureOutOfRangeException {
        if (celsius < -50 || celsius > 60) throw new TemperatureOutOfRangeException("Temperature out of range");
        System.out.println("Temperature OK: " + celsius + "°C");
    }
}
public class TemperatureSensorDemo {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        try {
            ts.read(25);
            ts.read(80); // triggers
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
