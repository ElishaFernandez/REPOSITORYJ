import java.util.Scanner;

public class switchnest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===FOOD ORDERING SYSTEM===");
        System.out.println("Welcome to the Food Ordering System! of Fernandez!");
        System.out.println("Please enter your order details below:");
        System.out.println("1 Burger");
        System.out.println("2 Pizza");
        System.out.println("3 Fries");
        System.out.println("Enter your menu choice (1-3):");
        int menuChoice = input.nextInt();

      int subChoice; 

        switch (menuChoice) {
            case 1:
                System.out.println("\nBURGER MENU");
                System.out.println("1 Cheese Burger");
                System.out.println("2 Veggie Burger");
                System.out.println("3 Bacon Burger");
                System.out.println("Enter your burger choice (1-3):");
                subChoice = input.nextInt(); // Kukuha ng input para sa burger
                
                // Nested Switch para sa partikular na Burger
                switch (subChoice) {
                    case 1: System.out.println("You ordered: Cheese Burger"); break;
                    case 2: System.out.println("You ordered: Veggie Burger"); break;
                    case 3: System.out.println("You ordered: Bacon Burger"); break;
                    default: System.out.println("Invalid Burger Choice");
                }
                break;
            case 2:
                System.out.println("PIZZA MENU");
                System.out.println("1 Margherita Pizza");
                System.out.println("2 Pepperoni Pizza");
                System.out.println("3 BBQ Chicken Pizza");
                System.out.println("Enter your pizza choice (1-3):");
                subChoice = input.nextInt();
                switch (subChoice) {
                    case 1: System.out.println("You ordered: Margherita Pizza"); break;
                    case 2: System.out.println("You ordered: Pepperoni Pizza"); break;
                    case 3: System.out.println("You ordered: BBQ Chicken Pizza"); break;
                    default: System.out.println("Invalid Pizza Choice");
                }
                break;
            case 3:
                System.out.println("FRIES MENU");
                System.out.println("1 Regular Fries");
                System.out.println("2 Curly Fries");
                System.out.println("3 Sweet Potato Fries");
                System.out.println("Enter your fries choice (1-3):");
                subChoice = input.nextInt();
                switch (subChoice) {
                    case 1: System.out.println("You ordered: Regular Fries"); break;
                    case 2: System.out.println("You ordered: Curly Fries"); break;
                    case 3: System.out.println("You ordered: Sweet Potato Fries"); break;
                    default: System.out.println("Invalid Fries Choice");
                }
                break;
            default:
                System.out.println("Invalid Menu Choice");
            }
    input.close();

        

    }
}