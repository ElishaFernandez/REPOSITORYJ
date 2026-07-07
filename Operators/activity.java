package Operators;

public class activity {
    public static void main (String[] args) {
        int x = 60;
        int y = 60;
        System.out.println(x);
        System.out.println(y);
        System.out.println("combined operation:" + (y/x++)); //60/60    
    }
}