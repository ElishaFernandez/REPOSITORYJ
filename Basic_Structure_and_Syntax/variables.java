package Basic_Structure_and_Syntax;

public class variables {
    
    public static void main(String[] args) {
        String name = "Elisha Fernandez";
        int age = 17;// declaring and initilizing variables
         final int score = 10;
        String subject;//declaring variables without initializing
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("score: " + score);
        age = 17; // reassigning the value  of age
        System.out.println("updated age " + age);
        float height = 5.2f;
        System.out.println("height: " + height);
        char section = 'A';
        System.out.println("section: " + section);
        boolean regularStudent = true;
        System.out.println("Regular Student " + regularStudent);


        String hobby = "eat, sleep, code, repeat";
        System.out.println("hobby: " + hobby);
    }
}