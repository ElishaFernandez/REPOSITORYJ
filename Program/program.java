package Program;

public class program {
        //if
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        //ifelse
         int negative = -5;

        if (negative > 10){
            System.out.println("The number is greater than 10.");

        } else {
            System.out.println("The number is not greater than 10.");
        }
        //ifthenelseifEx
         int whole = 15;

        if (whole > 20) {
            System.out.println("The number is greater than 20.");
        } else if (whole > 10) {
            System.out.println("The number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("The number is less than or equal to 10.");
        }
        //switch
          int menuChoice = 3;
        String menuName;
        menuName = "Not Available";
        switch (menuChoice) {
            case 1:
                menuName = "Adobo";
                break;
            case 2:
                menuName = "Sinigang";
                break;
            case 3:
                menuName = "Batchoy";
                break;
            case 4:
                menuName = "Tinola";
                break;
            case 5:
                menuName = "Kare-kare";
                break;
            case 6:
                menuName = "Pancit";
                break;
            default:
                menuName = "Not Available";
        }

        System.out.println("The menu item is: " + menuName);
    }

}
