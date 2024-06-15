package MatrixDSA;

public class MultidimensionalArrray {

    public static void main (String[] args ) {

//        int arr[][] = { {1,2,3,8,9},
//                        {4,5,6}};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
//        int n = 2;
//        int m = 3;
//        int arr[][] = new int[n][m];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++ ){
//                arr[i][j] = 10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int m = 3;
        int arr[][] = new int[m][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
