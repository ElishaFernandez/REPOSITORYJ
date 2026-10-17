package paper;

public class Jeepney extends Vehicle {
    private String route;

    public Jeepney(String plateNumber, String driverName, String route) {
        super(plateNumber, driverName, 0);
        this.route = route;
    }

  public String getRoute() {
    return route;
  }

  @Override
  public double computeFare(double km) {
    double extra = Math.max(0, km - 4) * 2;

    return 13.00 + extra;
  }

  @Override
  public int getCapacity() {
    return 20;
  }
}
