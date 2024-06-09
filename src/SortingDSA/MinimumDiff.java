package SortingDSA;

import java.util.Arrays;

public class MinimumDiff {

    public static void main(String[] args) {

        int[] array = {2,5,7,8};
        int n = array.length;
        int res = Integer.MAX_VALUE;

//        	for (int i = 0; i < n - 1; i++)
//			for (int j = i + 1; j < n; j++)
//				if (Math.abs((arr[i] - arr[j])) < res)
//					res = Math.abs((arr[i] - arr[j]));
//            }
//        }
//        System.out.println(res);

        Arrays.sort(array);

        for (int i = 1;i < n;i++){
            res = Math.min(res,array[i] - array[i - 1]);

        }
        System.out.println(res);
    }
}
