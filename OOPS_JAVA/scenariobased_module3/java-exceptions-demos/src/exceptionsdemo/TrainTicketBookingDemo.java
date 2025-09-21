package exceptionsdemo;
class TicketBooking {
    private int available;
    public TicketBooking(int available) { this.available = available; }
    public void book(int count) throws SeatsNotAvailableException {
        if (count > available) throw new SeatsNotAvailableException("Only " + available + " seats left");
        available -= count;
        System.out.println("Booked " + count + " seat(s).");
    }
}
public class TrainTicketBookingDemo {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking(3);
        try {
            tb.book(2);
            tb.book(2); // triggers
        } catch (SeatsNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
