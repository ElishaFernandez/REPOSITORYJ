package Operators;

public class increment {

    public static void main(String[] args) {
        System.out.println("Incrementing an integer:");
        int x = 5;
        System.out.println(
                "initial value of X:  " + ++x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        int y = 10;
        System.out.println("combined operation:" + (x + y)); // 5+10
        System.out.println("combined operation:" + (++x + y)); // 6+10
        System.out.println("combined operation:" + (x + ++y)); // 6 + 11
        System.out.println("combined operation:" + (x++ + y++)); // 6 + 11
        System.out.println("combined operation:" + (x + y--)); // 7 + 12
        System.out.println("combined operation:" + (--x + y)); // 6 + 11
        System.out.println("combined operation:" + (--x + ++y)); // 5 + 12
        System.out.println("combined operation:" + (--y + x));// 11 + 5
        System.out.println("combined operation:" + (x + ++y)); // 5 + 12
        System.out.println("combined operation:" + (x-- - y)); // 5 - 12
        System.out.println("combined operation:" + (--y + y)); // 11 + 11
        System.out.println("combined operation:" + (y - ++y));// 11 - 12
        System.out.println("combined operation:" + (--x - --y)); // 3 - 11
             System.out.println(y);// 11
              System.out.println(x);// 3
        System.out.println("combined operation:" + (x + ++y));// 3 + 12
            System.out.println("combined operation:" + (y / x++)); // 12/3
        System.out.println("combined operation:" + (x + ++y));
        

        System.out.println("MY ACTIVITY");
        int c = 60;
        int e = 60;
        System.out.println(c);
        System.out.println(e);
        System.out.println("combined operation:" + ((++c + e++) * 2)); // (61 + 60) * 2
    }
}
