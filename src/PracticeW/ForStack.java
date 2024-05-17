package PracticeW;

public class ForStack {
    public static void main(String[] args) {
        int x = 10;  // x is a local variable, stored in the stack
        int y = 20;  // y is a local variable, stored in the stack

        Person person1 = new Person("Alice");  // person1 is a reference, stored in the stack
        Person person2 = new Person("Bob");    // person2 is a reference, stored in the stack

        person1.setAge(30);
        person2.setAge(25);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}

class Person {
    private String name;  // name is an instance variable, stored in the heap
    private int age;      // age is an instance variable, stored in the heap

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}