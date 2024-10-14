package StackDSA;

//import PracticeW.Stack;

//import static jdk.internal.org.jline.utils.Colors.s;

import java.util.Stack;
public class LargestRectangularArea {

    static void getMaxArea(int arr[]){

        int res = 0;
        int n = arr.length;

//        for (int i = 0; i < n; i++){
//            int curr = arr[i];
//
//            for (int j = i - 1; j >= 0; j--){
//                if (arr[j] >= arr[i]){
//                    curr += arr[i];
//                }else {
//                    break;
//                }
//            }
//            for (int j = i + 1; j < n; j++){
//                if (arr[j] >= arr[i]){
//                    curr += arr[i];
//                }else {
//                    break;
//                }
//            }
//
//            res = Math.max(res,curr);
//        }
//
//        System.out.println(res);

        Stack<Integer> s = new Stack<>();
        int tp;
        int curr;

        for (int i = 0; i < n; i++){
            while (!s.empty() && arr[s.peek()] >= arr[i]){
                tp = s.pop();
                curr = arr[tp]*(s.empty() ? i : (i - s.peek() - 1));
                res = Math.max(res,curr);
            }
            s.push(i);
        }

        while (!s.empty()){
            tp = s.pop();
            curr = arr[tp]* (s.empty() ? n : (n - s.peek() - 1));
            res = Math.max(res,curr);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int arr[] = {60,20,50,40,10,50,60};

        getMaxArea(arr);
    }
}
