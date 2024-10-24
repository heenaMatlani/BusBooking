import java.util.List;
import java.util.Arrays;

public class BusBookingSystem {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user = new User("JohnDoe");

        // Admin adds buses
        admin.addBus("Bus1", 40, Arrays.asList("Monday", "Wednesday", "Friday"), "CityA-CityB");
        admin.addBus("Bus2", 30, Arrays.asList("Tuesday", "Thursday"), "CityA-CityC");

        // User browses buses
        List<Bus> availableBuses = user.browseBuses(admin.getBuses(), "CityA", "CityB");
        for (Bus bus : availableBuses) {
            System.out.println("Bus Name: " + bus.getBusName() + ", Available Seats: " +
                               (bus.getTotalSeats() - bus.getCurrentOccupancy()) + ", Color Code: " + bus.getSeatColorCode());
        }

        // User books a seat
        user.bookSeat(availableBuses.get(0), 5);

        // User cancels a booking
        user.cancelSeat(availableBuses.get(0), 5);
    }
}
