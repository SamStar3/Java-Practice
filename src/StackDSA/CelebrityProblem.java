package StackDSA;

public class CelebrityProblem {

        static int celebrity(int mat[][]) {
            int n = mat.length;
            int candidate = 0;

            // Step 1: Find the potential celebrity candidate
            for (int i = 1; i < n; i++) {
                if (mat[candidate][i] == 1) {
                    // Candidate knows i, so i could be the new candidate
                    candidate = i;
                }
            }

            // Step 2: Verify the candidate
            for (int i = 0; i < n; i++) {
                if (i != candidate) {
                    // The celebrity should not know anyone
                    // Everyone else should know the celebrity
                    if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                        return -1;
                    }
                }
            }

            return candidate;
        }

        public static void main(String[] args) {

            int mat[][] = {
                    {0,1,0},
                    {0,0,0},
                    {0,1,0}};

            System.out.println(celebrity(mat));
        }

}
