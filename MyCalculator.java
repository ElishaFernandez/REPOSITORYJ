import java.util.Scanner;

public class MyCalculator {
    // ADDS TWO NUMBERS. PARAMETERS: A,B RETURN TYPE: DOUBLE
    public static double add(double a, double b) {
        double sum = a + b;
        return sum; // sends the answer back to main
    }
    public static double subtract(double a, double b) {
        double difference = a - b;
        return difference; // sends the answer back to main
    }
    public static double multiply(double a, double b) {
        double product = a * b;
        return product; // sends the answer back to main
    }
    public static double divide(double a, double b) {
        double quotient = a / b;
        return quotient; // sends the answer back to main
    }
    public static double modulus(double a, double b) {
        double remainder = a % b;
        return remainder; // sends the answer back to main
    }
    // STEP2 write ur subtract, multiply, divide, and modulus methods here

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MY CALCULATOR ===");
        System.out.println("[1] Addittion");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        System.out.println("[5] Modulus");
       
        //step3 add menu lines for [2] to [5] here
        System.out.print("Choose an operation: ");
            int choice = input.nextInt();
        System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
             System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            if (choice == 1)  {
                double result = add(num1, num2); //num1 & num2 are the ARGUMENTS
                System.out.println("Result: " + result);
            }  else  if(choice == 2){
                double result = subtract(num1, num2);
                System.out.println("Result: " + result);
            }
              else if(choice == 3){
                double result = multiply(num1, num2);
                 System.out.println("Result: " + result);
              }
                else if(choice == 4){
                if (num2 == 0)
                    System.out.println("Error: Cannot divide by zero.");
                else {
                    double result = divide(num1, num2);
                    System.out.println("Result: " + result);   
                }
              }  else if(choice == 5){
                double result = modulus(num1, num2);
                 System.out.println("Result: " + result);
                
              }
              else {
                System.out.println("Invalid Choice");
             }
            input.close();
          

        }
}