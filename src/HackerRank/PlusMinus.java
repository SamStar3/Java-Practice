package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {


    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int n = arr.size();
        int pos = 0;
        int neg = 0;
        int zero= 0;

        for(int a : arr){
            if(a > 0){
                pos++;
            }else if(a < 0){
                neg++;
            }else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", (double) pos/n);
        System.out.printf("%.6f%n", (double) neg/n);
        System.out.printf("%.6f%n", (double) zero/n);

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        plusMinus(arr);

        scanner.close();

    }
}
