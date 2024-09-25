package Campus;

import java.util.Scanner;

public class Factorial {

    static int fun(int n ){

        if (n == 0 || n == 1) {

            return 1;
        }

        return n * fun( n - 1);
    }

    static int For(int n) {

        int sum = 1;
        for(int i = 1; i <= n; i++) {
            sum = sum * i;

        }
        return sum;
    }

    static int While(int n ) {

        int sum = 1;
        int i = 1;

        while(i <= n) {
            sum = sum * i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int n = 5;
        System.out.println(fun(n));
        System.out.println(For(n));
        System.out.println(While(n));
    }
}
