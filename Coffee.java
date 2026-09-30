public class Coffee {

    String coffeeName;
    String coffeeSize;
    String coffeeTaste;


    void showInfo() {
        System.out.println("Coffee Name: " + coffeeName);
        System.out.println("Coffee Size: " + coffeeSize);
        System.out.println("Coffee Taste: " + coffeeTaste);
    }
   void canOrder() {
        System.out.println("you can order this coffee.");

    }
   
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.coffeeName = "Latte";
        coffee.coffeeSize = "Medium";
        coffee.coffeeTaste = "Sweet";
        coffee.showInfo();
        coffee.canOrder();
    }

}