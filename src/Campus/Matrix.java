package Campus;

import java.util.Scanner;

public class Matrix {

    public static String addMatrices(int[][] A, int[][] B, int ml, int nl) {
        int[][] result = new int[ml][nl];
        StringBuilder output = new StringBuilder();

        // Adding corresponding elements of the matrices A and B
        for (int i = 0; i < ml; i++) {
            for (int j = 0; j < nl; j++) {
                result[i][j] = A[i][j] + B[i][j];
                output.append(result[i][j]).append(" ");  // Append each result element to the output
            }
        }

        return output.toString().trim();  // Convert the result to linear format
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for dimensions of matrix A
        String[] dimensionsA = scanner.nextLine().split(" ");
        int ml = Integer.parseInt(dimensionsA[0]);
        int nl = Integer.parseInt(dimensionsA[1]);

        // Input for dimensions of matrix B
        String[] dimensionsB = scanner.nextLine().split(" ");
        int m2 = Integer.parseInt(dimensionsB[0]);
        int n2 = Integer.parseInt(dimensionsB[1]);

        // Check if the matrices have the same dimensions
        if (ml != m2 || nl != n2) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return;
        }

        // Input for matrix A
        int[][] A = new int[ml][nl];
        for (int i = 0; i < ml; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < nl; j++) {
                A[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Input for matrix B
        int[][] B = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < n2; j++) {
                B[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Call the method to add matrices and get the result in a linear format
        String result = addMatrices(A, B, ml, nl);

        // Output the result
        System.out.println(result);
    }
}
