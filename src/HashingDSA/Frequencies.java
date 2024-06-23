package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {

    static void frequencies(int[] arr) {

        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            boolean flag = false;
//            for (int j = 0; j < i; j++ ) {
//                if (arr[i] == arr[j]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == true) {
//                continue;
//            }
//            int frq = 1;
//            for (int k = i +1; k < n; k++) {
//                if (arr[i] == arr[k]) {
//                    frq++;
//                }
//            }
//            System.out.println(frq);
//        }

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int x : arr){
            h.put(x,h.getOrDefault(x,0) + 1 );
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println(h);
    }

    public static void main(String[] args) {

        int arr[] = {10,12,10,15,10,20,12,12};


        frequencies(arr);
    }
}
