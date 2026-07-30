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

        switch (menuChoice) {
            case 1:
                System.out.println("BURGER MENU");
                System.out.println("1 Cheese Burger");
                System.out.println("2 Veggie Burger");
                System.out.println("3 Bacon Burger");
                break;
            case 2:
                System.out.println("PIZZA MENU");
                System.out.println("1 Margherita Pizza");
                System.out.println("2 Pepperoni Pizza");
                System.out.println("3 BBQ Chicken Pizza");
                break;
            case 3:
                System.out.println("FRIES MENU");
                System.out.println("1 Regular Fries");
                System.out.println("2 Curly Fries");
                System.out.println("3 Sweet Potato Fries");
                break;
            default:
                System.out.println("Invalid Menu Choice");
            }
    input.close();

        

    }
}