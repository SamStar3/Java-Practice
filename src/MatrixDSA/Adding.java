package MatrixDSA;

public class Adding {

    static int[][] addin(int A[][], int B[][]) {

        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        if(n1 != n2 || m1 != m2 ) {
            return new int[0][0];
        }

        int C[][] = new int[n1][m1];

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;

    }
    public static void main (String[] args) {

        int A[][] = {{3,4,5}, {4,4,5}, {3,5,6}};
        int B[][] = {{6,2,4}, {1,7,3}, {0,5,1}};

        int result[][] =  addin(A,B);
        for (int i = 0; i < A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
