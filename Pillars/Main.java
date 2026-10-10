package Pillars;

public class Main {

    public static void main(String[] args) {

        // Create objects
        Coffee coffee1 = new Coffee(
            "Latte", "Medium", 150, "Caramel Latte"
        );

        MilkTea milkTea1 = new MilkTea(
            "Matcha Milk Tea", "Large", 120, "Pearls"
        );

        // PILLAR 1 - ENCAPSULATION
        System.out.println("=== TESTING ENCAPSULATION ===");

        System.out.println("Original price: " + coffee1.getPrice());

        coffee1.setPrice(-50);

        System.out.println("Price after invalid input: " + coffee1.getPrice());

        // PARENT-TYPE ARRAY - POLYMORPHISM
        System.out.println("=== COFFEE SHOP MENU ===");

        Drink[] drinks = {coffee1, milkTea1};

        for (Drink drink : drinks) {

            System.out.println("Drink: " + drink.getDrinkName());
            System.out.println("Size: " + drink.getDrinkSize());
            System.out.println("Price: " + drink.getPrice());

            // PILLAR 3 - POLYMORPHISM
            drink.prepareDrink();
        }
    }
}

