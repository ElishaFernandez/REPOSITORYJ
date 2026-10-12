package Pillars;

public abstract class Drink {

    // PILLAR 1 - ENCAPSULATION
    private String drinkName;
    private String drinkSize;
    private double price;

    // Constructor
    public Drink(String drinkName, String drinkSize, double price) {
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;
        this.price = price;
    }

    // Getters
    public String getDrinkName() {
        return drinkName;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public double getPrice() {
        return price;
    }

    // Validating setter
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be greater than zero.");
        }
    }

    // PILLAR 4 - ABSTRACTION
    public abstract void prepareDrink();
}