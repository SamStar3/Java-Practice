package MatrixDSA;

public class Interchanging {

    static void interchangeRows(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Loop to swap rows in place
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int n1 = 4, m1 = 4;
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        interchangeRows(matrix1);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
//        printMatrix(matrix1);

    }
}
