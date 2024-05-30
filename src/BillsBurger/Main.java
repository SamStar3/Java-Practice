package BillsBurger;

public class Main {

    public static void main(String[] args) {

        Item cook = new Item("drink","coke",1.50);
        cook.printItem();
        cook.setSize("LARGE");
        cook.printItem();

        Item avocado = new Item("Topping","avocado",1.50);
        avocado.printItem();
    }
}
