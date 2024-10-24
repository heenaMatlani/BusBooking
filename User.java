import java.util.*;

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public List<Bus> browseBuses(List<Bus> buses, String source, String destination) {
        // Assuming the route format is "source-destination"
        List<Bus> availableBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getRoute().equalsIgnoreCase(source + "-" + destination)) {
                availableBuses.add(bus);
            }
        }
        return availableBuses;
    }

    public void bookSeat(Bus bus, int seatNumber) {
        bus.getSeats().get(seatNumber - 1).bookSeat(userName);
        bus.updateOccupancy();
    }

    public void cancelSeat(Bus bus, int seatNumber) {
        bus.getSeats().get(seatNumber - 1).cancelBooking();
        bus.updateOccupancy();
    }
}
