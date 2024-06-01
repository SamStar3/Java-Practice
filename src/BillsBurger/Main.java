package BillsBurger;

public class Main {

    public static void main(String[] args) {

//        Item cook = new Item("drink","coke",1.50);
//        cook.printItem();
//        cook.setSize("LARGE");
//        cook.printItem();
//
//        Item avocado = new Item("Topping","avocado",1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE","MAYO");
//        burger.printItem();
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chili");
        deluxeMeal.addBurgerToppings("AVOCADA","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
