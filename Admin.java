import java.util.*;

public class Admin {
    private List<Bus> buses;

    public Admin() {
        buses = new ArrayList<>();
    }

    public void addBus(String busName, int totalSeats, List<String> days, String route) {
        buses.add(new Bus(busName, totalSeats, days, route));
    }

    public void updateBusDetails(String busName, int newSeats) {
        for (Bus bus : buses) {
            if (bus.getBusName().equals(busName)) {
                bus = new Bus(busName, newSeats, bus.getOperationDays(), bus.getRoute());
            }
        }
    }

    public void deleteBus(String busName) {
        buses.removeIf(bus -> bus.getBusName().equals(busName));
    }

    public List<Bus> getBuses() {
        return buses;
    }
}
