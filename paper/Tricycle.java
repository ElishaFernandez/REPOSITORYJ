package paper;

public class Tricycle {
    public class Jeepney extends Vehicle {
    private String toda;
  

    public Jeepney(String plateNumber, String driverName, String toda) {
        super(plateNumber, driverName, 0);
        this.toda = toda;
    }

  public String gettoda() {
    return toda;
  }
}
}