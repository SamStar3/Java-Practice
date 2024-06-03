package SortingDSA;

import java.util.Map;
import java.util.TreeMap;

public class MergeArrays {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
        int n = a.length;
        int m = b.length;

        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();

        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }

        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

}
