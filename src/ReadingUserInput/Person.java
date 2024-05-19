package ReadingUserInput;

public class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Method to set age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to get age
    public int getAge() {
        return age;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to change age
    public void changeAge(Person person, int newAge) {
        person.setAge(newAge);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create an object named p1 of the Person class
        Person p1 = new Person("Alice");

        // Set p1's age to 10
        p1.setAge(10);

        // Display details
        System.out.println("Before changing age:");
        p1.displayDetails();

        // Change p1's age to 5
        p1.changeAge(p1, 5);

        // Display details again to see the change
        System.out.println("After changing age:");
        p1.displayDetails();
    }
}
