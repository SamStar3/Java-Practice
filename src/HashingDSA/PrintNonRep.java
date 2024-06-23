package HashingDSA;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintNonRep {

    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here

        HashMap<Integer, Integer> nonFre = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            nonFre.put(element, nonFre.getOrDefault(element,0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if (nonFre.get(element) == 1) {
                list.add(element);
            }
        }
        return list;
    }

    public static void main(String [] args) {
        int arr[] = {1,1,2,2,3,3,4,5,6,7};
        int n = arr.length;

    }
}
