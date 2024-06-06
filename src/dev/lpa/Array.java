package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args){

        int[] firstArray = getRandomNo(10);
        System.out.println(Arrays.toString(firstArray));

        int[] sortedArray = getsorted(new int[] {3,5,7});
        System.out.println(Arrays.toString(sortedArray));


        }


    public static int[] getRandomNo(int leg){

    Random random = new Random();
    int[] randomArray = new int[leg];
    for(int i = 0;i<leg;i++){
        randomArray[i] = random.nextInt(100);
    }
    return randomArray;
    }
    private static int[] getsorted(int[] array){

    int[] sortedArray = Arrays.copyOf(array,array.length);
    boolean flag = true;
    int temp;
    while (flag){
        flag = false;
        for(int i = 0;i < sortedArray.length-1;i++){
            if (sortedArray[i] < sortedArray[i + 1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }
        }

        System.out.println("--> " + Arrays.toString(sortedArray));
    }
    return sortedArray;
}
}
