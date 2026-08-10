package activity;
import java.util.Scanner;

class nestedifElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a nested if-else statement example");
        System.out.println("Enter your age:");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
            if (age >= 21) {
                System.out.println("You are also eligible to drink alcohol");
            } else {
                System.out.println("You are not eligible to drink alcohol");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}