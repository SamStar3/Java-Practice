package MatrixDSA;

public class SpiralTraversal {

    static void spiralTravesal(int [][] arr, int r, int c) {

        int top = 0;
        int left = 0;
        int bottom = r - 1;
        int right = c - 1;

        while ( top <= bottom && left <= right) {
            for (int  i = left; i <= right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");

            }
            right--;
            if (top <= bottom) {
                for (int i = right;i >= left;i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >=top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = { {1,2,3,4},
                         {5,6,7,8},
                      {9,10,11,12},
                     {13,14,15,16}};
        int r = arr.length;
        int c = arr[0].length;
        spiralTravesal(arr,r,c);

//        System.out.println( c);
    }
}
