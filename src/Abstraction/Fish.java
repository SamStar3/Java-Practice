package Abstraction;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size,weight);
    }

    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " walking");
        }else {
            System.out.println(type + " runnign");
        }
    }

    public void makeNoise() {

        if(type == "Wolf") {
            System.out.print("Howling! ");
        }else {
            System.out.print("Woof! ");
        }
    }
}
