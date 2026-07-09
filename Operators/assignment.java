package Operators;

public class assignment {

    public static void main(String[] args) {
        int a = 10; int b = 5;
        System.out.println(a += ++b); // a = a + 6
        System.out.println(b -= 3); // b = b - 3
        System.out.println(a *= 2); // a = a * 2
        System.out.println(a /= 4); // a = a / 4
        System.out.println(a %= 3); // a = a % 3
    }
} 