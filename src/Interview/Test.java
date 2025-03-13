package Interview;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int realPrice = sc.nextInt();
        int finalPrice = 0;

        if (realPrice < 500) {
            finalPrice = (2 * realPrice) / 100;
            System.out.println("Your Discount is 2 Percentage");
        } else if (realPrice >= 500 && realPrice < 1000) {
            finalPrice = (5 * realPrice) / 100;
            System.out.println("Your Discount is 5 Percentage");
        } else if (realPrice >= 1000) {
            finalPrice = (10 * realPrice) / 100;
            System.out.println("Your Disount is 10 Percentage");
        }

        System.out.print("Your Final Amount is = " );
        System.out.println( realPrice - finalPrice );
        sc.close();
    }
}