public class Person {
    //field and its also called attributes
    String firstName;
    String lastName;
    int age;
    String gender;

    //constructor is a blueprint how u do an object
  
    //METHOD TO DISPLAY INFORMATION
    void displayInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    void sayHello() {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }
}