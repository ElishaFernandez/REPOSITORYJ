package Program;

public class program {

    public static void main(String[] args) {

        System.out.println("===FOOD ORDERING SYSTEM===");

        String food = "Burger";
        int quantity = 3;
        int menuChoice = 2;
        int price = 300;
        int total = price * quantity;


        // SWITCH
        switch (menuChoice) {
            case 1:
                food = "Adobo";
                break;
            case 2:
                food = "Burger";
                break;
            case 3:
                food = "Pizza";
                break;
            case 4:
                food = "Fried Chicken";
                break;
            case 5:
                food = "Spaghetti";
                break;
            default:
                food = "Not Available";
        }


        System.out.println("===Order Details===");
        System.out.println("Food Ordered : " + food);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Amount : " + total);

        // IF-ELSE
        System.out.println("===Discount===");
        if (total >= 500) {
            System.out.println("Congratulations!");
            System.out.println("You received a 10% discount.");
        } else {
            System.out.println("Sorry!");
            System.out.println("No discount.");
        }

        System.out.println("===Thank you for your order!===");
        System.out.println("===Enjoy your meal!===");
    }
}