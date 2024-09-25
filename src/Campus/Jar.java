package Campus;

import java.util.Scanner;

public class Jar {

    public static void main(String[] args) {
        int n = 10;
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();

        if (k <= 5 && 1 <= k) {
            System.out.println("Number of Candies : " + k);
        }else {
            System.out.println("Invalid Value");
        }
        System.out.println("Number of Candies Available : " + (n - k));
    }
}
