import java.util.Scanner;

public class switchnest {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        int menuChoice;
        int subChoice = 0;
        int drinksChoice = 0; 
        int mainPrice = 0;
        int drinkPrice = 0;

        System.out.println("===FOOD ORDERING SYSTEM===");
        System.out.println("1 Burger");
        System.out.println("2 Pizza");
        System.out.println("3 Fries");
        System.out.print("Enter choice (1-3): ");
        menuChoice = input.nextInt();

        //NESTED SWITCH PARA SA PAGKAIN
        switch (menuChoice) {
            case 1: //BURGER
                System.out.println("1 Cheese Burger - P250");
                System.out.println("2 Veggie Burger - P300");
                System.out.println("3 Bacon Burger - P350");
                System.out.print("Enter burger choice: ");
                subChoice = input.nextInt();

                switch (subChoice) {
                    case 1: mainPrice = 250; 
                    break;
                    case 2: mainPrice = 300; 
                    break;
                    case 3: mainPrice = 350; 
                    break;
                }
                break;

            case 2: //PIZZA
                System.out.println("1 Pepperoni Pizza - P800");
                System.out.println("2 Hawaiian Pizza - P700");
                System.out.println("3 All Veggie Pizza - P1000");
                System.out.print("Enter pizza choice: ");
                subChoice = input.nextInt();

                switch (subChoice) {
                    case 1: mainPrice = 800; 
                    break;
                    case 2: mainPrice = 700; 
                    break;
                    case 3: mainPrice = 1000; 
                    break;
                }
                break;

            case 3: //FRIES
                System.out.println("1 Cheese Fries - P45");
                System.out.println("2 BBQ Fries - P45");
                System.out.println("3 Sour Cream Fries - P45");
                System.out.print("Enter fries choice: ");
                subChoice = input.nextInt();

                switch (subChoice) {
                    case 1: mainPrice =   95; 
                    break;
                    case 2: mainPrice = 95; 
                    break;
                    case 3: mainPrice = 95; 
                    break;
                }
                break;
        }

        //SWITCH PARA SA DRINKS
        System.out.println("Choose Your Drinks");
        System.out.println("1 Gulaman - P150");
        System.out.println("2 Cucumber - P170");
        System.out.println("3 Apple Juice - P170");
        System.out.print("Enter drinks choice: ");
        drinksChoice = input.nextInt();

        switch (drinksChoice) {
            case 1: drinkPrice = 150; 
            break;
            case 2: drinkPrice = 170; 
            break;
            case 3: drinkPrice = 170; 
            break;
        }

      
        int totalBill = mainPrice + drinkPrice;
        
        System.out.println("=== RECEIPT ===");
        System.out.println("Main Price : P" + mainPrice);
        System.out.println("Drink Price: P" + drinkPrice);
        System.out.println("TOTAL BILL : P" + totalBill);
        System.out.println("===============");

        input.close();
    }
}
