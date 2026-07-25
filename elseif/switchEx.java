package Switch;

public class switchEx {
    
    public static void main(String[] args) {
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
