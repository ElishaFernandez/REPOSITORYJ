import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int customer = 1;
        int totalSales = 0;

        while (customer <= 5) {

            int totalBill = 0;
            int reorder;

            System.out.println();
            System.out.println("====================================");
            System.out.println("       WELCOME TO FERNAN'S");
            System.out.println("          FOOD STORE");
            System.out.println("====================================");
            System.out.println("CUSTOMER " + customer);

            do {

                System.out.println();
                System.out.println("=========== FOOD MENU ===========");
                System.out.println("1. Burger       - P250");
                System.out.println("2. Pizza        - P700");
                System.out.println("3. Fries        - P45");
                System.out.println("4. Drinks");
                System.out.println("=================================");

                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                int price = 0;
                String food = "";

                switch (choice) {

                    case 1:
                        food = "Burger";
                        price = 250;
                        break;

                    case 2:
                        food = "Pizza";
                        price = 700;
                        break;

                    case 3:
                        food = "Fries";
                        price = 45;
                        break;

                    case 4:

                        System.out.println();
                        System.out.println("========= DRINKS MENU =========");
                        System.out.println("1. Gulaman       - P150");
                        System.out.println("2. Apple Juice   - P170");
                        System.out.println("3. Cucumber Juice- P200");
                        System.out.println("===============================");

                        System.out.print("Choose drink: ");
                        int drink = input.nextInt();

                        switch (drink) {

                            case 1:
                                food = "Gulaman";
                                price = 150;
                                break;

                            case 2:
                                food = "Apple Juice";
                                price = 170;
                                break;

                            case 3:
                                food = "Cucumber Juice";
                                price = 200;
                                break;

                            default:
                                System.out.println("Invalid drink choice.");
                        }

                        break;

                    default:
                        System.out.println("Invalid food choice.");
                }

                // Kung valid ang order
                if (price > 0) {

                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    if (quantity > 0) {

                        int subtotal = price * quantity;

                        totalBill += subtotal;

                        System.out.println();
                        System.out.println("ORDER ADDED!");
                        System.out.println("Item: " + food);
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Subtotal: P" + subtotal);
                        System.out.println("Current Total: P" + totalBill);

                    } else {

                        System.out.println("Invalid quantity.");
                    }
                }

                // Ask if customer wants another order
                do {

                    System.out.println();
                    System.out.print("Add another order? ");
                    System.out.println("(1 = Yes, 2 = No)");

                    reorder = input.nextInt();

                    if (reorder != 1 && reorder != 2) {
                        System.out.println("Invalid input! Please enter 1 or 2.");
                    }

                } while (reorder != 1 && reorder != 2);

            } while (reorder == 1);

            // PAYMENT
            System.out.println();
            System.out.println("====================================");
            System.out.println("             CHECKOUT");
            System.out.println("====================================");

            System.out.println("Customer: " + customer);
            System.out.println("Total Bill: P" + totalBill);

            int cash;

            do {

                System.out.print("Enter cash payment: P");
                cash = input.nextInt();

                if (cash < totalBill) {
                    System.out.println("Insufficient payment!");
                    System.out.println("You still need P" + (totalBill - cash));
                }

            } while (cash < totalBill);

            int change = cash - totalBill;

            // RECEIPT
            System.out.println();
            System.out.println("====================================");
            System.out.println("              RECEIPT");
            System.out.println("====================================");
            System.out.println("Fernan's Food Store");
            System.out.println("Customer: " + customer);
            System.out.println("------------------------------------");
            System.out.println("Total Bill : P" + totalBill);
            System.out.println("Cash       : P" + cash);
            System.out.println("Change     : P" + change);
            System.out.println("====================================");
            System.out.println("       THANK YOU FOR ORDERING!");
            System.out.println("====================================");

            // Add to total sales
            totalSales += totalBill;

            customer++;

        }

        // SHOP SUMMARY
        System.out.println();
        System.out.println("====================================");
        System.out.println("             SHOP CLOSED");
        System.out.println("====================================");
        System.out.println("Total Customers: 5");
        System.out.println("Total Sales: P" + totalSales);
        System.out.println("====================================");

        input.close();
    }
}