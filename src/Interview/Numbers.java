package Interview;

import java.util.*;

public class Numbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
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

        String numstr = String.valueOf(num);
        Set<String> set = new HashSet<>();

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

        System.out.println(numstr);
    }

//    static HashSet<String> solution(String numstr,int a, int z, Set<String> set){
//
//        if (a == z){
//            set.add(numstr);
//        }
//
//    }
}
