package HashingDSA;

import java.util.Arrays;
import java.util.HashSet;

public class OpenAddressing {

    static int longestSub(int[] arr, int n ) {
//        Arrays.sort(arr);
//        int res = 1;
//        int cur = 1;
//        for (int i = 0; i < n; i++ ){
//            if (arr[i] == arr[i +1]) {
//                cur++;
//            }else if (arr[i] != arr[i - 1]) {
//                res = Math.max(res, cur);
//                cur = 1;
//            }
//        }
//        return Math.max(res,cur);

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int res = 1;
        for (Integer num : set) {
            if (set.contains(num - 1) == false) {
                int cur = 1;
                while (set.contains(num + cur)) {
                    cur++;

                }
                res = Math.max(res, cur);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {2,9,4,3,10};
        int n = arr.length;

        System.out.println(longestSub(arr,n));
    }
}
