public class forLoop {

    public static void main(String[] args) {

        int row = 5;

        // Center Triangle
        for (int i = 0; i < row; i++) {

            for (int a = row - i - 1; a >= 1; a--)
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

            for (int a = row - i - 1; a >= 1; a--)
                System.out.print("  ");

            for (int a = 0; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }
    }
}