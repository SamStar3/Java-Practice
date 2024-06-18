package MatrixDSA;

public class BooleanMatrix {
    void booleanMatrix(int matrix[][]) {
        int R = matrix.length;
        int C = matrix[0].length;

        // Arrays to keep track of rows and columns that need to be modified
        boolean[] row = new boolean[R];
        boolean[] col = new boolean[C];

        // Traverse the matrix to find cells with value 1
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Update the matrix based on the row and col arrays
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        BooleanMatrix sol = new BooleanMatrix();

        // Example 1
        int[][] matrix1 = {
                {1, 0},
                {0, 0}
        };
        sol.booleanMatrix(matrix1);
        printMatrix(matrix1);

        // Example 2
        int[][] matrix2 = {
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0},
                {0, 0, 0}
        };
        sol.booleanMatrix(matrix2);
        printMatrix(matrix2);
    }

    // Helper function to print the matrix
    static void printMatrix(int matrix[][]) {
        int R = matrix.length;
        int C = matrix[0].length;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
