package paper;

public class Bus extends Vehicle{
       private int seats;
  

    public Bus(String plateNumber, String driverName, int seats) {
        super(plateNumber, driverName, 0);
        this.seats = seats;
    }

  public int getSeats() {
    return seats;
  }
}
