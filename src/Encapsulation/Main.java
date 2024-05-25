package Encapsulation;

public class Main {
    public static void main(String[] args){

//        Player player = new Player();
//
//        player.name = "Sam";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer sam = new EnhancedPlayer("Sam",200,"sword");
        System.out.println("Initial health is  " + sam.healthRemaining());
    }
}
