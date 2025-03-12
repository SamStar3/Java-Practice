package HackerRank;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b){

        return a+b;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();

        sc.close();
        int sum;
        System.out.println(solveMeFirst(a,b));

    }
}
