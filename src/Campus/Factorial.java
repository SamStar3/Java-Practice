package Campus;

import java.util.Scanner;

public class Factorial {

    static int fun(int n ){

        if (n == 0 || n == 1) {

            return 1;
        }

        return n * fun( n - 1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int n = 5;
        System.out.print(fun(n));
    }
}
