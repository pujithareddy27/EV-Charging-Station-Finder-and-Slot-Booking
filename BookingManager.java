import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        this.bookings = new ArrayList<>();
    }

    public Booking bookSlot(User user, ChargingStation station) {
        Slot availableSlot = station.getAvailableSlot();
        if (availableSlot != null) {
            Booking booking = new Booking(user, station, availableSlot);
            bookings.add(booking);
            return booking;
        } else {
            System.out.println("No available slots at this station.");
            return null;
        }
    }

    public void cancelBooking(Booking booking) {
        booking.getSlot().setBooked(false);
        bookings.remove(booking);
        System.out.println("Booking canceled.");
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}

