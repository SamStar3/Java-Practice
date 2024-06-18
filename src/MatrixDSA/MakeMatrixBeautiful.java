package MatrixDSA;

public class MakeMatrixBeautiful {

    public static int findMinOperation(int N, int[][] matrix) {
        int[] rowSum = new int[N];
        int[] colSum = new int[N];

        // Calculate the sum of each row and column
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        // Find the maximum sum among all rows and columns
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Calculate the number of operations needed
        int operations = 0;
        for (int i = 0; i < N; i++) {
            operations += (maxSum - rowSum[i]);
        }

        return operations;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        System.out.println(findMinOperation(2, matrix1));  // Output: 4

        // Example 2
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 2, 3},
                {3, 2, 1}
        };
        System.out.println(findMinOperation(3, matrix2));  // Output: 6
    }
}
