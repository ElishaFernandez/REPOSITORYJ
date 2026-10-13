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
}
