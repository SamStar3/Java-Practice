package Abstraction;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size,weight);
    }

    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " walking");
        }else {
            System.out.println(getExplicitType() + " runnign");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    public void makeNoise() {

        if(type == "Wolf") {
            System.out.print("Howling! ");
        }else {
            System.out.print("Woof! ");
        }
    }

}
