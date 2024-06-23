package HashingDSA;

import java.util.HashSet;

public class PairOne {

//    static void sumExists(int arr[], int n, int sum ) {

//        for (int i = 0; i < n - 1; i++) {
//            for(int j = 1;j < n; j ++){
//                if( arr[i] + arr[j] == sum ) {
//                    System.out.println(1);
//                    System.out.println(arr[i] + " + " + arr[j]);
//                    break;
//                }
//            }
//        }
//        int i = 0;
//        int j = n - 1;
//
//        while (i < j){
//            if (arr[i] + arr[j] == sum) {
//                System.out.println(1);
//            }
//            i++;
//            j--;
//        }

//    }


    public static int sumExists(int arr[], int N, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int complement = sum - arr[i];

            if (set.contains(complement)) {
                return 1;
            }

            set.add(arr[i]);
        }

        return 0;
    }


    public static void main(String[] args)  {

        int N = 10;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 14;

        System.out.println(sumExists(arr,N,sum));
    }
}
