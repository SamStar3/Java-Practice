package StackDSA;

import java.util.Stack;


public class NextGreater {

    static void printNextGreater(int arr[]){

        int n = arr.length;

//        for (int i = 0; i < n; i++){
//            int j;
//            for (j = i + 1; j < n; j++){
//                if (arr[i] < arr[j]){
//                    System.out.println(arr[j]);
//                    break;
//                }
//            }
//            if (i == n - 1){
//                System.out.println(-1);
//            }
//        }

//        Stack<Integer> stack = new Stack<>();
//        15
//18
//12
//12
//12
//18
//18
//-1
        Stack<Integer> s = new Stack<>();

        s.push(arr[n - 1]);
        System.out.println(-1);

        for (int i = n - 2; i >= 0; i--){

            while (s.empty() == false && arr[i] > s.peek() ){
                s.pop();
            }
            if (s.empty()){
                System.out.println(-1);
            }else {
                System.out.println(s.peek());
            }
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,15,10,8,6,12,9,18};

        printNextGreater(arr);
    }
}
