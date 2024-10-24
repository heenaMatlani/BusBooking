import java.util.*;

public class Bus {
    private String busName;
    private int totalSeats;
    private int currentOccupancy;
    private List<String> operationDays;
    private String route;
    private List<Seat> seats;

    public Bus(String busName, int totalSeats, List<String> operationDays, String route) {
        this.busName = busName;
        this.totalSeats = totalSeats;
        this.operationDays = operationDays;
        this.route = route;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
        this.currentOccupancy = 0;
    }

    public String getBusName() { return busName; }
    public int getTotalSeats() { return totalSeats; }
    public int getCurrentOccupancy() { return currentOccupancy; }
    public List<String> getOperationDays() { return operationDays; }
    public String getRoute() { return route; }
    public List<Seat> getSeats() { return seats; }

    public void updateOccupancy() {
        currentOccupancy = (int) seats.stream().filter(Seat::isBooked).count();
    }

    public String getSeatColorCode() {
        double occupancyRate = ((double) currentOccupancy / totalSeats) * 100;
        if (occupancyRate <= 60) return "Green";
        else if (occupancyRate <= 90) return "Yellow";
        else return "Red";
    }
}
