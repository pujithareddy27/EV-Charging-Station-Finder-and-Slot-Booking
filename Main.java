import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Managers
        ChargingStationManager stationManager = new ChargingStationManager();
        BookingManager bookingManager = new BookingManager();

        // Create Charging Stations
        ChargingStation station1 = new ChargingStation("CS001", "Central Station", "Downtown", "Fast Charger", 5);
        ChargingStation station2 = new ChargingStation("CS002", "North Station", "Uptown", "Super Charger", 3);

        // Add Stations to the Manager
        stationManager.addStation(station1);
        stationManager.addStation(station2);

        // Create User
        User user1 = new User("U001", "Alice", "Tesla Model S");

        // Find Stations by Location
        List<ChargingStation> downtownStations = stationManager.filterByLocation("Downtown");
        System.out.println("Stations in Downtown:");
        for (ChargingStation station : downtownStations) {
            System.out.println(station);
        }

        // Book a Slot
        Booking booking1 = bookingManager.bookSlot(user1, station1);
        if (booking1 != null) {
            System.out.println("Booking successful:");
            System.out.println(booking1);
        }

        // List all bookings
        System.out.println("All Bookings:");
        for (Booking booking : bookingManager.getAllBookings()) {
            System.out.println(booking);
        }

        // Cancel a Booking
        bookingManager.cancelBooking(booking1);
        System.out.println("After cancellation:");

        // List all bookings again
        for (Booking booking : bookingManager.getAllBookings()) {
            System.out.println(booking);
        }
    }
}
