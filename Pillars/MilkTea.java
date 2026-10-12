package Pillars;

public class MilkTea extends Drink {

    // PILLAR 2 - INHERITANCE
    private String topping;

    public MilkTea(String drinkName, String drinkSize,
                   double price, String topping) {

        super(drinkName, drinkSize, price);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    // PILLAR 3 - POLYMORPHISM
    @Override
    public void prepareDrink() {
        System.out.println("Preparing milk tea...");
        System.out.println("Topping: " + topping);
    }
}