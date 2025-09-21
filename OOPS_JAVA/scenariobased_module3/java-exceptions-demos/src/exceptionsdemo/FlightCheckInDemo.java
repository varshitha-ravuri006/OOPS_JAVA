package exceptionsdemo;
import java.time.*;
class FlightCheckIn {
    private LocalDateTime departure;
    public FlightCheckIn(LocalDateTime departure) { this.departure = departure; }
    public void checkIn(LocalDateTime now) throws LateCheckInException {
        if (Duration.between(now, departure).toMinutes() < 30) {
            throw new LateCheckInException("Check-in closes 30 minutes before departure");
        }
        System.out.println("Check-in successful");
    }
}
public class FlightCheckInDemo {
    public static void main(String[] args) {
        FlightCheckIn f = new FlightCheckIn(LocalDateTime.now().plusMinutes(25));
        try {
            f.checkIn(LocalDateTime.now()); // triggers
        } catch (LateCheckInException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
