import java.time.LocalDateTime;

public class Booking {
    private User user;
    private ChargingStation station;
    private Slot slot;
    private LocalDateTime bookingTime;

    public Booking(User user, ChargingStation station, Slot slot) {
        this.user = user;
        this.station = station;
        this.slot = slot;
        this.bookingTime = LocalDateTime.now();
        slot.setBooked(true);
    }

    public User getUser() {
        return user;
    }

    public ChargingStation getStation() {
        return station;
    }

    public Slot getSlot() {
        return slot;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    @Override
    public String toString() {
        return "Booking by " + user.getName() + " at " + station.getName() + ", Slot: " + slot.getSlotId() + " on " + bookingTime;
    }
}
