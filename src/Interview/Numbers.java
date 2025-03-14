package Interview;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Numbers {

    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        int arr[] = new int[num];
//        for (int i = 0; i < num; i++){
//            arr[i] = sc.nextInt();
//        }

//        for (int i = 1; i <= num; i++){
//            if (i == num)
//        }

//        HashSet<Integer> hash = new HashSet<>();
//        Deque<Integer> map = new LinkedList<>();
//
//        for (int i = 1; i <= num; i++) {
//            hash.add(sc.nextInt());
//            map.add(sc.nextInt());
//        }

//        String numstr = String.valueOf(num);
//        Set<String> set = new HashSet<>();

//        solution(numstr,0,numstr.length() - 1,set);




//        for(int i = 0; i < num; i++){
//            for (int j = 1; j < num;j++){
//                int a = arr[i];
//                int b = arr[j];
//                System.out.print(a + " " + b);
//
//
//            }
//        }

//        System.out.println(numstr);

//    static HashSet<String> solution(String numstr,int a, int z, Set<String> set){
//
//        if (a == z){
//            set.add(numstr);
//        }
//
//    }


        int number = 123;
        String numStr = String.valueOf(number);
        Set<String> permutations = new HashSet<>();

        int n = numStr.length();
        char[] arr = numStr.toCharArray();

        generatePermutations(arr, 0, n - 1, permutations);

        for (String perm : permutations) {
                System.out.println(perm);
        }
    }
    private static void generatePermutations(char[] arr, int left, int right, Set<String> permutations) {
        if (left == right) {
            permutations.add(new String(arr));
        } else {
            for (int i = left; i <= right; i++) {
                swap(arr, left, i);
                generatePermutations(arr, left + 1, right, permutations);
                swap(arr, left, i);
            }
        }
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
