package Abstraction;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {

        super(type, size,weight);
    }

    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        }else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    public void makeNoise() {

        if(type == "Goldfish") {
            System.out.print("swish ");
        }else {
            System.out.print("splash ");
        }
    }
}
