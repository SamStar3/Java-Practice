package JavaUdemy;

public class CarMain {
    public static void main (String args[]){
        Car car = new Car();
        car.setColor("Red");
        car.setConvertible(false);
        car.setMade("ferrari");
        car.setDoors(2);
        car.setModel("Z200");
        car.describeCar();

        System.out.println(car.getMade());
    }
}
