package Operators;

public class increment {

    public static void main(String[] args) {
       
        

        System.out.println("MY ACTIVITY");
        int c = 60;
        int e = 60;
        System.out.println(c++);
        System.out.println(e--);
        System.out.println(--c + e++); 
        System.out.println("combined operation:" + ((++c + e++) * 2)); // (61 + 60) * 2
    }
}
