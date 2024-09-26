package Campus;

import java.util.Scanner;

public class CheckSameDigit {

    static void check(int sum) {

        int check = 0;
        check = sum * sum;

        if(sum == (check % (int) Math.pow(10,String.valueOf(sum).length()))){
            System.out.println("Is Correct");
        }else {
            System.out.println("Is Not Correct");
        }

//        if(sum > 9) {
//            check = sum * sum;
//            int res = 0;
//            res = check % 100;
//            if (sum == res) {
//                System.out.println("Is it Correct");
//            } else {
//                System.out.println("Is it Not Correct");
//            }
//        }else if(sum < 10) {
//            check = sum * sum;
//            int res = 0;
//            res = check % 10;
//            if (sum == res) {
//                System.out.println("Is it Correct");
//            } else {
//                System.out.println("Is it Not Correct");
//            }
//        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        check(sum);
    }
}
