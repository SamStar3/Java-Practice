package CompositionChallenge;

public class SmartkitchenMain {
    public static void main (String[] args) {

        Smartkitchen kitchen = new Smartkitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}