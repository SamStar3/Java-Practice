package Campus;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        System.out.println("Guess between 2 to 12");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
//        int max = 12;
//        int min = 2;
        int randomNum = rand.nextInt(11) + 2;
        int num = sc.nextInt();
//        boolean flag = true;
//        int count = 1;

        for (int i = 0; i < 5; i++) {
            if (randomNum == num) {
                System.out.println("Correct");
            }else if (num < 2 || num > 12) {
                System.out.println("Invalid Input");
                num = sc.nextInt();
//                count++;
            }
            else if (randomNum > num) {
                System.out.println("Too low");
                num= sc.nextInt();
//                count++;
            }else if (randomNum < num) {
                System.out.println("Too High");
                num = sc.nextInt();
//                count++;
            }

        }


//        while (flag){
//            count++;
//            int num = sc.nextInt();
//            if (randomNum == num ) {
//                System.out.println("Correct");
////                flag = false;
//            }else if (num < 2 || num > 12) {
//                System.out.println("Invalid Number");
//                num = sc.nextInt();
//            }else if (randomNum > num){
//                System.out.println("Too Low");
//                num = sc.nextInt();
////                flag = true;
//            }else if (randomNum < num ) {
//                System.out.println("Too High");
//                num = sc.nextInt();
//            }
//        }

    }
}
