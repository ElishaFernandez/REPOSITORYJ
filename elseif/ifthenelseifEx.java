package elseif;

public class ifthenelseifEx {
    public static void main(String[] args) {
        int number = 15;

        if (number > 20) {
            System.out.println("The number is greater than 20.");
        } else if (number > 10) {
            System.out.println("The number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("The number is less than or equal to 10.");
        }
    }
    
}
