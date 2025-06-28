// Define a custom class called Person
class Person {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        // Using Person class as a data type
        Person p1 = new Person(); // p1 is a variable of type Person
        p1.name = "Alice";
        p1.age = 25;

        Person p2 = new Person(); // another object of type Person
        p2.name = "Bob";
        p2.age = 30;

        // Print their details
        System.out.println("Person 1: " + p1.name + ", Age: " + p1.age);
        System.out.println("Person 2: " + p2.name + ", Age: " + p2.age);
    }
}
