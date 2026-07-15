package Operators; 

import java.util.Scanner;

class UserProfileScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        System.out.println("\n--- Food Scanner ---");
        System.out.print("Enter food item: ");
        String name = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.println("\n--- Food Information ---");
        System.out.println("Food Item: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);

        input.close();
    }
}