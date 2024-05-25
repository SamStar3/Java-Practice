package SearchDSA;

import java.util.Scanner;
import java.util.Vector;

public class CountOnlyRepeated {


    static class Pair {

        long x;

        long y;

        Pair(long x, long y) {

            this.x = x;

            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    static Pair sequence(Vector<Long> a) {

        // if array has no repeating element, we return (-1,-1).
        if (a.size() - (a.get(a.size() - 1) - a.get(0)) == 1) {
            return new Pair(-1l, -1l);
        }

        int s = 0;
        int e = a.size() - 1;

        // using binary search to find the repeating element.
        while (s < e) {
            int m = (s + e) / 2;

            // if arr[m]=m+a[0], there is no repeating
            // number in [s..m].
            if (a.get(m) >= m + a.get(0)) s = m + 1;

                // else there is repeating number in [s..m].
            else
                e = m;
        }
        // returning the repeated element and its frequency.
        return new Pair(a.get(s), a.size() - (a.get(a.size() - 1) - a.get(0)));
    }

    public static Pair findRepeating(long arr[], int n) {
        Vector<Long> vec = new Vector<>();
        for (long num : arr) {
            vec.add(num);
        }
        Pair p = sequence(vec);
        return p;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

            CountOnlyRepeated.Pair p = new CountOnlyRepeated().findRepeating(arr, n);

            System.out.println(p.x + " " + p.y);
        }
    }
}
