package Pillars;

public class Vehicle  {
    private String plateNumber;
    private String driverName;
    private int passengers;

    public Vehicle(String plateNumber, String driverName) {
        this.plateNumber = plateNumber;
        this.driverName = driverName;
        this.passengers = 0;
    }

    public String getPlateNumber() {return plateNumber;}
    public String getDriverName() {return driverName;}
    public int getPassengers() {return passengers;}

    public void setPassengers(int passengers){
        if (passengers >=0)  {
            this.passengers = passengers;
        } else {
            System.out.println("Invalid number of passengers count.");
        }
    }

    public double computeFare(double km) {return 13.00;}

    public void showInfo() {
        System.out.println(plateNumber + "Driver:" + driverName + "Passengers:" + passengers);
    }
}

