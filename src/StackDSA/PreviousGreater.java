package StackDSA;

import java.util.Queue;
import java.util.Stack;

public class PreviousGreater {

    static void printPreviousGreater(int arr[]){

        int n = arr.length;

//        for (int i = 0; i < n; i++ ){
//            int j;
//            for (j = i - 1; j >=0 ; j--){
//                if (arr[i] < arr[j]) {
//                    System.out.println(arr[j]);
//                    break;
//                }
//            }
//            if (j == -1 ) {
//                System.out.println(-1);
//            }
//        }

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        System.out.println(-1);

        for (int i = 1; i < n; i++){

            while (stack.empty() == false && stack.peek() <= arr[i]){
                stack.pop();
            }
            int pg = (stack.empty()) ? - 1 : stack.peek();
            System.out.println(pg);
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {20,30,10,5,15};

        printPreviousGreater(arr);
    }
}
