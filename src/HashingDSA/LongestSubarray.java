package HashingDSA;

import java.util.HashMap;

public class LongestSubarray {

    static int longSub(int arr[], int sum, int n){
//        int res = 0;

//        for (int i = 0; i < n; i++) {
//            int currsum = 0;
//            for (int j = i; j < n; j++) {
//                currsum += arr[j];
//                if (currsum == sum ) {
//                    res = Math.max(res, j - i +1);
//                }
//            }
//        }
//        return res;

        HashMap<Integer, Integer> map = new HashMap<>();

        int presum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            presum += arr[i];
            if (presum == sum) {
                res = i + 1;

            }
            if (map.containsKey(presum) == false) {
                map.put(presum,i);
            }
            if (map.containsKey(presum - sum)) {
                res = Math.max(res, i - map.get(presum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = {5,2,3,4};
        int sum = 5;
        int n = arr.length;

        System.out.println(longSub(arr,sum,n));
    }
}
