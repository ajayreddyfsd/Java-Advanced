// Class Address used as part of Person class
class Address {
    String city;
    String country;
}

// Class Person uses Address => composition
class Person {
    String name;
    int age;
    Address address;  // Composition: Person "has-an" Address
}

public class Main {
    public static void main(String[] args) {
        // Create Address object
        Address addr1 = new Address();
        addr1.city = "Toronto";
        addr1.country = "Canada";

        // Create Person object and assign address
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 28;
        p1.address = addr1;  // assign composed object

        // Create another person with their own address
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 34;
        p2.address = new Address();  // inline new object
        p2.address.city = "Vancouver";
        p2.address.country = "Canada";

        // Print their details
        System.out.println("Person 1: " + p1.name + ", Age: " + p1.age +
                           ", City: " + p1.address.city + ", Country: " + p1.address.country);

        System.out.println("Person 2: " + p2.name + ", Age: " + p2.age +
                           ", City: " + p2.address.city + ", Country: " + p2.address.country);
    }
}
