package SortingDSA;

import java.util.Arrays;

public class CountingSort {

//    public static void main(String[] args) {

//        int[] arr = {1,4,4,1,0,1};
//        int k = 5;
//        int n = arr.length;
//
//        int count[] = new int[k];
//
////        for (int i = 0; i < k;i++){
////            count[i] = 0;
////        }
//        for (int i = 0;i < n;i++) {
//            count[arr[i]]++;
//        }
//        int index = 0 ;
//        for (int i = 0; i < k;i++) {
//            for (int j = 0; j < count[i];j++){
//                arr[index++] = i;
//            }
//        }
//
//        System.out.println(Arrays.toString(count));
//        System.out.println(Arrays.toString(arr));

        public static String countSort(String arr)
        {
            // Create an array to store the count of each character.
            int[] count = new int[26]; // 26 for each lowercase English letter

            // Count frequencies of each character in the input string.
            for (int i = 0; i < arr.length(); i++) {
                count[arr.charAt(i) - 'a']++;
            }

            // Build the sorted string based on the count array.
            StringBuilder sortedString = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                while (count[i] > 0) {
                    sortedString.append((char) (i + 'a'));
                    count[i]--;
                }
            }

            // Return the sorted string.
            return sortedString.toString();
        }

        // Driver code to test the function
        public static void main(String[] args) {
            // Test case 1
            String input1 = "edsab";
            String output1 = countSort(input1);
            System.out.println(output1); // Expected output: "abdes"

            // Test case 2
            String input2 = "geeksforgeeks";
            String output2 = countSort(input2);
            System.out.println(output2); // Expected output: "eeeefggkkorss"
        }
}
