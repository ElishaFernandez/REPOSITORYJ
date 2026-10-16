package paper;

    public class Tricycle extends Vehicle {
    private String toda;
  

    public Tricycle(String plateNumber, String driverName, String toda) {
        super(plateNumber, driverName, 0);
        this.toda = toda;
    }

  public String getToda() {
    return toda;
  }

  @Override
  public double computeFare(double km) {
    return 20.00 + (km * 10.00);
  }
}
