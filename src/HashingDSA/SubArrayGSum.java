package HashingDSA;

import java.util.HashSet;

public class SubArrayGSum {

    static boolean givenSum(int[] arr, int sum, int n) {

//        for (int i = 0; i < n; i++) {
//            int res = 0;
//            for (int j = i;j < n; j++) {
//                res += arr[j];
//                if (res == sum ) {
//                    return true;
//                }
//            }
//        }
//        return false;

        HashSet<Integer> set = new HashSet<>();

        int res = 0;

        for (int num : arr) {
            res += num;

            if (res == sum){
                return true;
            }
            if (set.contains(res - sum)) {
                return true;
            }
            set.add(res);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {5,8,6,13,3,-1};
        int sum = 22;
        int n = arr.length;

        System.out.println(givenSum(arr,sum,n));
    }
}
