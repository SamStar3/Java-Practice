package HashingDSA;

import java.util.*;

public class SortElement {

    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> elements = new ArrayList<>();
        for (int num : arr) {
            elements.add(num);
        }

        Collections.sort(elements, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freq1 = frequencyMap.get(o1);
                int freq2 = frequencyMap.get(o2);
                if (freq1 != freq2) {
                    return freq2 - freq1; // Higher frequency comes first
                } else {
                    return o1 - o2; // If frequency is same, smaller element comes first
                }
            }
        });

        // Create result list from sorted elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : elements) {
            result.add(num);
        }

        return result;
    }

    public static void main(String[] args){
        int arr[] = {5,5,4,6,4};
        int n = arr.length;

        sortByFreq(arr,n);
    }
}
