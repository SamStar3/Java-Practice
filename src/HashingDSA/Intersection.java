package HashingDSA;

import java.util.HashMap;
import java.util.HashSet;

public class Intersection {

    static void intersection(int a[], int b[], int m, int n) {
//        for (int i = 0; i < m; i++) {
//            boolean flag =false;
//            for (int j = 0; j < n; j++) {
//                if (a[i] == b[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag = true) {
//                System.out.println(a[i] + " ");
//            }
//        }

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < n; i++) {
            h.add(b[i]);
        }
        for (int i = 0; i < m;i++ ) {
            if (h.contains(a[i])) {
                System.out.println(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {10,30};
        int m = 3;
        int n = 2;

        intersection(a  , b, m, n);
    }
}
