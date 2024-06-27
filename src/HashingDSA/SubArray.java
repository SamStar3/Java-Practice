package HashingDSA;

import java.util.HashSet;

public class SubArray {

    static void subarray(int arr[]) {

//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == 0) {
//                    System.out.println(true);
//                }
//            }
//        }
//        System.out.println(false);

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum)){
                System.out.println(true);
            }
            if (sum == 0){
                System.out.println(true);
            }
            set.add(sum);
        }
    }
    public static void main(String[] args) {

        int arr[] = {4,-3,1,2};

        subarray(arr);
    }
}
