package HashingDSA;

import java.util.HashMap;

public class CountNonRep {

    static void countNonRepeated(int arr[],int n ){

        HashMap<Integer, Integer> freMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            freMap.put(element,freMap.getOrDefault(element,0) + 1);
        }

        System.out.println(freMap.keySet());
        long count = 0;
        for (int value : freMap.values()) {
            if (value == 1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,4,5,6,7};
        int n = arr.length;
        countNonRepeated(arr,n);
    }
}
