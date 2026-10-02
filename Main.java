public class Main {
    public static void main(String[] args) {
        Person person = new Person("ELISHA", "Dela Cruz", 20, "Male");

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        person.displayInfo();
        person.sayHello();
    }
}