package ArrayDSA;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class maxSubarray {
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<Integer>(
                List.of(1, 2, 3, 4, 5, 7, 8));
        int n = a.size();
        System.out.println(longestEvenOddSubarray(a, n));
    }

    static int longestEvenOddSubarray(ArrayList<Integer> a,
                                      int n)
    {

        int ans = 1;

        for (int i = 0; i < n; i++) {
            int cnt = 1;

            for (int j = i + 1; j < n; j++) {
                if ((a.get(j - 1) % 2 == 0
                        && a.get(j) % 2 != 0)
                        || (a.get(j - 1) % 2 != 0
                        && a.get(j) % 2 == 0))
                    cnt++;
                else
                    break;
            }

            ans = Math.max(ans, cnt);
        }

        if (ans == 1)
            return 0;
        return ans;
    }
}