package StackDSA;

import java.util.Arrays;

public class LargestRectangle {

    static void findLargest(int[][] matrix){

        int res = 0;
        int n = matrix.length;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    arr[i] = 0;
                }else {
                    arr[i] += matrix[i][j];
                }
                int curr = arr[0];

                for (int k = 0; k < n; k++){

                    for (int a = k - 1; a >=0; a--){
                        if (arr[a] >= arr[k]){
                            curr += arr[k];
                        }
                    }
                    for (int a = i + 1; a < n; a++){
                        if (arr[a] >= arr[k]){
                            curr += arr[k];
                        }
                    }

                }
                res = Math.max(res, curr);

            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(res);
    }
    public static void main(String[] args) {

        int matrix[][] = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}};

        findLargest(matrix);
    }
}
