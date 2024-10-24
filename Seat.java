public class Seat {
    private int seatNumber;
    private boolean isBooked;
    private String bookedBy;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
        this.bookedBy = null;
    }

    public int getSeatNumber() { return seatNumber; }
    public boolean isBooked() { return isBooked; }
    public String getBookedBy() { return bookedBy; }

    public void bookSeat(String userName) {
        if (!isBooked) {
            isBooked = true;
            bookedBy = userName;
        } else {
            throw new IllegalStateException("Seat already booked");
        }
    }

    public void cancelBooking() {
        isBooked = false;
        bookedBy = null;
    }
}
