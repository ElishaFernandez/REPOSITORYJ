package Program;

public class program {

    public static void main(String[] args) {

        int menuChoice = 2;
        int quantity = 3;
        int price = 250;
        int total = quantity * price;
        int diningOption = 1;

        // SWITCH
        switch (menuChoice) {
            case 1:
                System.out.println("Food: Burger");
                break;
            case 2:
                System.out.println("Food: Pizza");
                break;
            case 3:
                System.out.println("Food: Fries");
                break;
            default:
                System.out.println("Invalid Menu");
        }

        // IF
        if (quantity > 0) {
            System.out.println("Order Accepted");
        }

        // IF-ELSE
        if (total >= 500) {
            System.out.println("Free Drink");
        } else {
            System.out.println("No Free Drink");
        }

        // IF-ELSE IF
        if (diningOption == 1) {
            System.out.println("Dine In");
        } else if (diningOption == 2) {
            System.out.println("Take Out");
        } else if (diningOption == 3) {
            System.out.println("Delivery");
        } 

    }
}