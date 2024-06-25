package HashingDSA;

import java.util.HashSet;

public class Union {

    static void union(int a[], int b[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        System.out.println(set.size() );
    }

    public static void main(String[] args) {

        int[] a = {10,20,10};
        int[] b = {5,10,5};

        union(a,b);
    }
}
