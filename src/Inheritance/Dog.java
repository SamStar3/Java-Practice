package Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    public Dog(){
        super("mutt","Big",200);
    }

    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small": (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type.equals("Wolf") ){
            System.out.println("Ow Wooooo!  ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walks, run amd wag their tail");
        if(speed == "slow"){
            walk();
            wag();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Dog Barking...  ");
    }
    private void run(){
        System.out.println("Dog Running...  ");
    }
    private void walk(){
        System.out.println("Dog walking...  ");
    }
    private void wag(){
        System.out.println("Tail Waging...  ");
    }
}
