import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        int customer = 1;
        int totalSales = 0;

      
        while (customer <= 5) {

     
            int totalBill = 0;
            int reorder;

            System.out.println("=== CUSTOMER " + customer + " ===");

            do {

  
                System.out.println("===== WELCOME SA FOOD ORDERING SYSTEM NI FERNANDEZ! =====");
                System.out.println("===== FOOD MENU =====");
                System.out.println("1. Burger - P250");
                System.out.println("2. Pizza - P700");
                System.out.println("3. Fries - P45");
                System.out.println("4. Drinks");

  
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
                        System.out.println("===== DRINKS MENU =====");
                        System.out.println("1. Gulaman - P150");
                        System.out.println("2. Apple Juice - P170");
                        System.out.print("Choose drink: ");
                        int drink = input.nextInt();

                        // Nested switch para sa drinks
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
                                System.out.println("Invalid drink.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                
                if (price > 0) {

               
                    System.out.print("Quantity: ");
                    int quantity = input.nextInt();

                    int total = price * quantity;

                  
                    totalBill += total;

                    System.out.println(food + " x" + quantity);
                    System.out.println("Subtotal: P" + total);
                }

               
                do {

                    System.out.print("Add another order? (1 = Yes, 2 = No): ");
                    reorder = input.nextInt();

              
                    if (reorder != 1 && reorder != 2) {
                        System.out.println("Invalid input! Please enter 1 or 2.");
                    }

                } while (reorder != 1 && reorder != 2);

            } while (reorder == 1);

            // Receipt ng customer
            System.out.println("----- RECEIPT -----");
            System.out.println("Customer " + customer);
            System.out.println("Total Bill: P" + totalBill);

            totalSales += totalBill;

            customer++;

            System.out.println();
        }

        // Lalabas kapag natapos na ang 5 customer
        System.out.println("========================");
        System.out.println("SHOP CLOSED");
        System.out.println("Total Sales: P" + totalSales);

        // Isinasara ang Scanner
        input.close();
    }
}