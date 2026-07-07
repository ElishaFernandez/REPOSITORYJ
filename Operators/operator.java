package Operators;
 
public class operator { 

public static void main(String[] args) {
   int addend1 = 10, addend2 = 20, sum;
   sum = addend1 + addend2;
   System.out.println("Sum of these numbers: " + sum);
  
   int minuend = 30, subtrahend = 15, difference;
   difference = minuend - subtrahend;
    System.out.println("Difference of these numbers: " + difference);
   
    int multiplicand = 5, multiplier = 4, product;
    product = multiplicand * multiplier;
    System.out.println("Product of these numbers: " + product);
   
    int dividend = 20, divisor = 4, quotient;
    quotient = dividend / divisor;
    float remainder = dividend % divisor;
    System.out.println("Quotient of these numbers: " + quotient);
    System.out.println("Remainder of these numbers: " + remainder);
    
    int number = 10;
    number++;
    System.out.println("Incremented value: " + number);
    number--;
    System.out.println("Decremented value: " + number);
   
    int a = 5, b = 10;
    boolean result = (a < b) && (b > 0);
    System.out.println("Logical AND result: " + result);



  } 

}