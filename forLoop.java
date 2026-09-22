public class forLoop {

    public static void main(String[] args) {

        int row = 5;

        // Center Triangle
        for (int i = 0; i < row; i++) {

<<<<<<< HEAD
            for (int a = row - i - 1; a >= 1; a--)
=======
            for (int a = i ; a <= row; a++)
>>>>>>> 8071078718cd5bdeeb1365c512bd079749a1871a
                System.out.print(" ");

            for (int a = 0; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }

        // Left Triangle
        for (int i = 0; i < row; i++) {

            for (int a = 0; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }

        // Right Triangle
        for (int i = 0; i < row; i++) {

<<<<<<< HEAD
            for (int a = row - i - 1; a >= 1; a--)
=======
            for (int a = i; a <= row; a++)
>>>>>>> 8071078718cd5bdeeb1365c512bd079749a1871a
                System.out.print("  ");

            for (int a = 0; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }
    }
}