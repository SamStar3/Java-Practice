package HashingDSA;

import java.util.HashMap;

public class FirstRepeating {

    static int fristRepeating(int arr[], int n) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();

        for (int i = 0; i < n; i++ ) {
            int element = arr[i];
            count.put(element,count.getOrDefault(element,0) + 1);
            if (!firstOccurrence.containsKey(element)){
                firstOccurrence.put(element,i);
            }
        }

        int firstRepeating =  -1;

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if (count.get(element) > 1) {
            int pos = firstOccurrence.get(element) +1;
                if (firstRepeating == -1 || pos < firstRepeating) {
                    firstRepeating = pos;
                }
            }
        }
        return firstRepeating;
    }

    public static void main (String[] args ) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        int n = arr.length;

        System.out.println(fristRepeating(arr, n));
    }
}
