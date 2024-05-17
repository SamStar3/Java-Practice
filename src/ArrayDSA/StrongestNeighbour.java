package ArrayDSA;

public class StrongestNeighbour {
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sizeOfArray - 1; i++) {
            sb.append(Math.max(arr[i], arr[i + 1])).append(" ");
        }
        System.out.println(sb);
//        StringBuffer sb = new StringBuffer();
//
//        // Iterating through all window of size two.
//        for(int i = 0, j = 1;i<sizeOfArray-1 && j < sizeOfArray;i++, j++){
//            //Appending the maximum between two adjacent elements.
//            sb.append(Math.max(arr[i], arr[j]) + " ");
//        }
//        //Printing the maximum for every adjacent pairs in the array.
//        System.out.print(sb);
}
    public static void main(String[] args) {
        int n1 = 3;
        int[] arr1 = {89,89,60};
        System.out.print("Output for Example 1: ");
        maximumAdjacent(n1, arr1);

        int n2 = 2;
        int[] arr2 = {5, 5};
        System.out.print("Output for Example 2: ");
        maximumAdjacent(n2, arr2);
    }
}
