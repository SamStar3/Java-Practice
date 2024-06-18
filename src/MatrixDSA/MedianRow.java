package MatrixDSA;

import java.util.Arrays;

public class MedianRow      {

    static void madMed(int[][] arr, int r, int c ) {
        int min = arr[0][0];
        int max = arr[0][c - 1];
        for (int i = 1;i < r; i++) {
            if (arr[i][0] < max) {
                min = arr[i][0];
            } if (arr[i][c-1] > max) {
                max = arr[i][c-1];
            }
        }
        int medPos = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) /2;
            int midPos = 0;
            for (int i  = 0; i < r; i++ )  {
                int pos = Arrays.binarySearch(arr[i], mid) + 1;
                midPos += Math.abs(pos);
            }
            if (midPos < medPos) {
                min = mid+1;
            }else {
                max = mid;
            }
        }
        System.out.print(min);
    }



    public static void main(String [] args) {
        int[][] arr = {{1,10,20},{15,25,35},{5,30,40}};
        int r = arr.length;
        int c = arr[0].length;

        madMed(arr,r,c);
    }
}
