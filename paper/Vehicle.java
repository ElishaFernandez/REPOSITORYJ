package paper;

public class Vehicle {
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
        if (passenger >= 0) {
            this.passenger = passengers;
        } else {
            System.out.println("Invalid passenger count.");
        }
    }
    public double computeFare(double km) {
        return 13.00;
    }

    public void showInfo() {
        System.out.println(plateNumber + "Driver:" + driverName + " passengers: " + passenger );
    }
}
