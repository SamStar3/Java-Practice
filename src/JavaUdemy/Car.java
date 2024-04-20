package JavaUdemy;

public class Car {
    private String made = "Tesla";
    private String model = "X200";
    private String color = "Gray";
    private int doors = 4;

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMade(){
        return made;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMade(String made){
        this.made = made;
    }
    private boolean convertible = true ;
        public void describeCar(){
            System.out.println(doors + " Doors " + model + " Model " + color + " Color " + made + " Made " + (convertible ? " Convertible " : " "));
        }
}
