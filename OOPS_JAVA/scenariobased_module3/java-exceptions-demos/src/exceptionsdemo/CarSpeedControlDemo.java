package exceptionsdemo;
class Car {
    public void setSpeed(int kmph) throws OverSpeedException {
        if (kmph > 120) throw new OverSpeedException("Speed over 120 km/h");
        System.out.println("Speed set to " + kmph + " km/h");
    }
}
public class CarSpeedControlDemo {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.setSpeed(130); // triggers
        } catch (OverSpeedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
