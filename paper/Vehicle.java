package paper;

public abstract class Vehicle {
    private String plateNumber;
    private String driverName;
    private int passenger;

    public Vehicle(String plateNumber, String driverName, int passenger) {
        this.plateNumber = plateNumber;
        this.driverName = driverName;
        this.passenger = 0;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPassenger() {
        return passenger;
    }


    public void setPassenger(int passengers)
    {
        if (passenger < 0) {
            throw new IllegalArgumentException("Passenger count cannot be negative: " + passengers);
        } else {
            this.passenger = passengers;
        }
    }
     
    public abstract double computeFare(double km);

    public void showInfo() {
       System.out.println(plateNumber + ": Driver: " + driverName + " Passengers: " + passenger + "/" + getCapacity());
    }

public abstract int getCapacity();


 //CHECKED: the header must say "throws OverloadException"
 public void board(int count) throws OverloadException {
 if (passenger + count > getCapacity()) {
 throw new OverloadException(plateNumber + " is full! Capacity "
 + getCapacity() + ", but " + (passenger + count) + " tried to ride.");
 }
 passenger = passenger + count;
 }
  //UNCHECKED: no "throws" needed in the header
 public double quoteFare(double km) throws InvalidDistanceException {
 if (km <= 0) {
   throw new InvalidDistanceException("Distance must be more than 0 km, got " + km);
 }
 return computeFare(km);  //polymorphism: each vehicle's own formula
 
 }
 }

