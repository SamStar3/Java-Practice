package HashingDSA;

import java.util.Arrays;
import java.util.HashSet;

public class CountDist {

    static void countDist(int arr[]){

        int n = arr.length;

//        int res = 0;
//
//        for (int i = 0; i < n; i++){
//            boolean flag = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    flag =true;
//                    break;
//                }
//            }
//            if (flag == false) {
//                res++;
//            }
//        }
//        System.out.println(res);

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println(set.size());

//        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));  //if we use Integer arr that time let us use this...
//        System.out.println(set.size());
    }

    public static void main(String[] args) {
        int arr[] = {10,20,10,30,0};

        countDist(arr);
    }
}
