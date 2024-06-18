package MatrixDSA;

public class SearchInRowCol {

    static void searchInRowCol(int[][] arr, int r, int c, int x) {
//        for(int i = 0;  i < r; i++) {
//            for (int j = 0; j <  c; j++){
//                if (arr[i][j] == x) {
//                    System.out.print("Found at (" + i + "," + j + ")");
//                    return;
//                }
//            }
//        }
//        System.out.print("Not Found");

        int i =0;
        int j = c - 1;

        while (i < r && j >= 0) {
            if (arr[i][j] == x) {
                System.out.print("Found at (" + i + "," + j + ")");
                return;
            }else if (arr[i][j] > x) {
                j--;
            }else {
                i++;
            }
        }
        System.out.print("Not Found");
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,6,7},{8,9,10,11},{12,13,14,15}};

        int x = 5;
        int r = arr.length;
        int c = arr[0].length;

        searchInRowCol(arr,r,c,x);
    }
}
