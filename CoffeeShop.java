public class CoffeeShop {
//field (and it is also called attributes)
    String name;
    String size;
    String taste;

    public CoffeeShop(String nameInput, String sizeInput, String tasteInput) {
        name = nameInput;
        size = sizeInput;
        taste = tasteInput;
    }

    void showInfo() {
        System.out.println("Coffee Name: " + name);
        System.out.println("Coffee Size: " + size);
        System.out.println("Coffee Taste: " + taste);
    }
    void makeCoffee() {
        System.out.println("Making Coffee...");
    }
   
    public static void main(String[] args) {
        CoffeeShop kape1 = new CoffeeShop("Latte", "Medium", "Sweet");
        CoffeeShop kape2 = new CoffeeShop("Cappuccino", "Large", "Bitter");
       //kape is the object of the class CoffeeShop
       //instance ang tawag sa kape object
       
        
        kape1.showInfo();
        kape1.makeCoffee();
        kape2.showInfo();
        kape2.makeCoffee();
    }
//camel naming convention
}