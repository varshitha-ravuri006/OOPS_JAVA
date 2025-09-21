package exceptionsdemo;
class Hotel {
    public void book(int days) throws ExcessStayDurationException {
        if (days > 30) throw new ExcessStayDurationException("Cannot book for more than 30 days");
        System.out.println("Room booked for " + days + " day(s)");
    }
}
public class HotelRoomBookingDemo {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            h.book(40); // triggers
        } catch (ExcessStayDurationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
