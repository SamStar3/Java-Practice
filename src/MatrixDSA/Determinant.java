package MatrixDSA;

import java.util.Arrays;

public class Determinant {

    static int determinantOfMatrix(int matrix[][], int n) {
        // Base case for 1x1 matrix
        if (n == 1) {
            return matrix[0][0];
        }

        // Base case for 2x2 matrix
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int determinant = 0;

        for (int col = 0; col < n; col++) {
            // Get the cofactor matrix by removing the first row and the current column
            int[][] subMatrix = getCofactor(matrix, 0, col, n);

            // Recursive call to find the determinant of the submatrix
            int subDeterminant = determinantOfMatrix(subMatrix, n - 1);

            // Add or subtract the cofactor to the determinant
            determinant += matrix[0][col] * subDeterminant * (col % 2 == 0 ? 1 : -1);
        }

        return determinant;
    }

    // Helper function to get the cofactor matrix
    static int[][] getCofactor(int matrix[][], int p, int q, int n) {
        int[][] subMatrix = new int[n - 1][n - 1];
        int row = 0, col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != p && j != q) {
                    subMatrix[row][col++] = matrix[i][j];

                    // Row is filled, go to next row and reset col to 0
                    if (col == n - 1) {
                        col = 0;
                        row++;
                    }
                }
            }
        }

        return subMatrix;
    }

    public static void main (String[] args) {
        int[][] arr = {{1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}};
        int n = 4;

        System.out.println("Determinant of the given matrix is " + determinantOfMatrix(arr, n));
    }
}
