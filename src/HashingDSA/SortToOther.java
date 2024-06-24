package HashingDSA;

import java.util.*;

public class SortToOther {

    static int[] sortA1byA2(int A1[], int N, int A2[], int M){

        Map<Integer, Integer> position = new HashMap<>();

        for (int i = 0; i < M; i++) {
            if (!position.containsKey(A2[i])) {
                position.put(A2[i],i);
            }
        }

        List<Integer> present = new ArrayList<>();

        List<Integer> notPresent = new ArrayList<>();

        for (int num : A1) {
            if (position.containsKey(num)){
                present.add(num);
            }else {
                notPresent.add(num);
            }
        }


        Collections.sort(present, (a,b) -> position.get(a) - position.get(b));
        Collections.sort(notPresent);

        int[] result = new int[N];
        int index = 0;
        for (int num : present){
            result[index++] = num;
        }
        for (int num : notPresent) {
            result[index++] = num;
        }
        return result;

    }

    public static void main(String[] args) {

        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};

        int N = 11;
        int M = 4;

        int arr[] = sortA1byA2(A1,N,A2,M);
        System.out.println(Arrays.toString(arr));
    }
}
