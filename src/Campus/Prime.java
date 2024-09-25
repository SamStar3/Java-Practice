package Campus;

import java.util.Scanner;

public class Prime {

    static void isPrime(int n) {

        if (n == 2 || n == 3) {
            System.out.println("Is Prime Number");
        }
        if (n % 2 != 0 && n % 3 != 0){
//            return true;
            System.out.println("Is Prime Number");
        }else
            System.out.println("Is Not Prime Number");
//            return false;
    }

    static void For(int n ) {
        int count = 1;

        for(int i = 2; i < n/2 ; i+=2) {
            if(n % i == 0){
                System.out.println("Is Not Prime");
                count++;
            }
            if(count == 2) {
                System.out.println("Is Not Prime");
            }else {

                System.out.println("Is Prime");
            }
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        isPrime(n);
//        For(n);
    }
}
