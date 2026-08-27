public class forLoop2 {
    public static void main(String[] args) {

        int row = 5;

      //TRIANGLE
        for(int i = 1; i <= row; i++){
            
            for(int a = i; a <= row; a++)
                System.out.print(" ");

            
            for(int a = 1; a <= i; a++)
                System.out.print("* ");
            
            System.out.println();
        }

      //LEFT TRIANGLE
        for (int i = 1; i <= row; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //RIGHT TRIANGLE
        for (int i = 0; i < row; i++) {

            for (int a = i; a <= row; a++)
                System.out.print("  ");

            for (int a = 0; a <= i; a++)
                System.out.print("* ");

            System.out.println();
        }
    }

}