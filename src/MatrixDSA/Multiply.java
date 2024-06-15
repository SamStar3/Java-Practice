package MatrixDSA;

public class Multiply {

    static int[][] multiplyMatrix(int A[][], int B[][]) {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        if (m1 != n2) {
            return new int[0][0];
        }

        int[][] result = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = { { 4, 8 }, { 0, 2 }, { 1, 6 } };
        int[][] B = { { 5, 2 }, { 9, 4 } };

        int[][] result = multiplyMatrix(A, B);

        for (int[] row : result) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
        }
    }
}
