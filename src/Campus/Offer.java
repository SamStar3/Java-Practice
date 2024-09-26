package Campus;

import java.util.Scanner;

public class Offer {

    static void offer(int Bonus, String g, String c) {

        if(g == "M" && c == "Sr") {
            System.out.println(Bonus * 0.7);
        } else if (g == "F" && c == "Sr") {
            System.out.println(Bonus * 0.5);
        }else if (g == "M" && c == "N") {
            System.out.println(Bonus);
        }else {
            System.out.println(Bonus * 0.7);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String g = sc.nextLine();
        String c = sc.nextLine();
        int Bonus = 100;

        offer(Bonus,g,c);
    }
}
