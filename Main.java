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

class Person {
    String firstName;
    String lastName;
    int age;
    String gender;

    Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    void sayHello() {
        System.out.println("Hello! I am " + firstName + " " + lastName + ".");
    }
}