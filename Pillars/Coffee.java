package Pillars;

public class Coffee extends Drink {

    // PILLAR 2 - INHERITANCE
    private String coffeeType;

    public Coffee(String drinkName, String drinkSize,
                  double price, String coffeeType) {

        super(drinkName, drinkSize, price);
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    // PILLAR 3 - POLYMORPHISM
    @Override
    public void prepareDrink() {
        System.out.println("Preparing coffee...");
        System.out.println("Coffee type: " + coffeeType);
    }
}