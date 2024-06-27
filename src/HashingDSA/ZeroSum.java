package HashingDSA;

import java.util.HashMap;

public class ZeroSum {

    static int zeroSum(int[] arr, int n ) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += arr[i];
            if (sum == 0){
                count++;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
    }

    public static void main(String [] args) {

        int[] arr = {0,0,5,5,0,0};
        int n = arr.length;

        System.out.println(zeroSum(arr,n));
    }
}
