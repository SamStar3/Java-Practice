package MatrixDSA;

import java.util.Arrays;

public class Transpose {

    static void transpose (int[][] arr) {

        int n = arr.length;

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++){

                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        transpose(arr);

        System.out.println(Arrays.deepToString(arr));
    }
}
