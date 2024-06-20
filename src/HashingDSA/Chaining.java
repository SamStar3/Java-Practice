package HashingDSA;

import java.util.ArrayList;

public class Chaining {

    public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {

        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>(hashSize);

        for (int i = 0; i < hashSize; i++){
            hashTable.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int hashIndex = element % hashSize;

            hashTable.get(hashIndex).add(element);
        }

        return hashTable;
    }

    public static void main(String[] args) {

        int hashSize = 10;
        int [] arr = {92,4,14,24,44,91};

        ArrayList<ArrayList<Integer>> result = separateChaining(arr, arr.length,hashSize);

        System.out.println("Hash Table 1: ");


        for (int i = 0; i < result.size(); i++){
            if (!result.get(i).isEmpty()){
                System.out.print(i);

                for (int num : result.get(i)) {
                    System.out.print("->" + num );
                }
                System.out.println();
            }
        }
    }
}
