package MatrixDSA;

import java.util.Arrays;

public class RotateMatrix {

    static void rotateMatrix(int[][] arr) {

        int n = arr.length;

//        for (int i = n - 1; i >= 0;i--) {
//            for (int j = 0; j < n; j++){
//                System.out.print(arr[j][i] + " ");
//            }
//        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        rotateMatrix(arr);

//        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
