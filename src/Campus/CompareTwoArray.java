package Campus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompareTwoArray {

    static void compare(int[][] arr) {

//        System.out.println(arr.length);

//        for (int i = 0; i < arr.length; i++){
//     -+*       for (int j = 0; j < arr[i].length; j++) {
////                System.out.println(arr[i][j]);
//
//                if (arr[i][j] == arr[i+1][j+1]) {
//                    System.out.println("S");
//                }
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i < arr[j].length && arr[i][j] == arr[j][i]) {
//
////                    System.out.println(i + "<" + arr[j].length + "&&" + arr[i][j] +"==" + arr[j][i]);
//                    System.out.print(arr[i][j] + " ");
////                    System.out.println(j);
//                }
//
//            }
//    }
        Map<String, Integer> pairMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // Sort the pair to handle cases like (5, 10) and (10, 5)
            int[] sortedPair = new int[]{Math.min(arr[i][0], arr[i][1]), Math.max(arr[i][0], arr[i][1])};
            String pairKey = Arrays.toString(sortedPair); // Create a unique key for the pair

            if (pairMap.containsKey(pairKey)) {
                System.out.println("Duplicate pair found: " + Arrays.toString(arr[i]));
//                System.out.println("Original pair: " + Arrays.toString(arr[pairMap.get(pairKey)]));
            } else {
                // Store the index of the pair
                pairMap.put(pairKey, i);
            }
        }

    }

        public static void main(String[] args){

            int arr[][] = {
                    {2, 5, 6}, {5, 2}, {4, 4,}, {4,4}, {3, 11}
            };

            compare(arr);
        }

}
