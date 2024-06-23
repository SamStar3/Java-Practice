package PracticeW;

import java.util.Arrays;

public class Solve {

    public static void solve(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

//        return dp[m][n];
        System.out.println("The length of the longest common subsequence is " + dp[m][n]);

        System.out.println(Arrays.deepToString(dp));
    }

    public static void main(String[] args) {
        String s1 = "011010";
        String s2 = "00000";
//        int result = solve(s1, s2);
        solve(s1, s2);
//        System.out.println("The length of the longest common subsequence is " + result);
    }
}
