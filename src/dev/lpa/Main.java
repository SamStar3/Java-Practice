package dev.lpa;

import com.abc.first.Item;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Item firstItem = new Item("burger");
//        System.out.println(firstItem);

//        com.abc.first.Item secondItem = new com.abc.first.Item("Burger");
//        System.out.println(secondItem);
//
//        int[] myIntArray = new int[10];
////        myIntArray[5] = 50;
//        int k = 1;
//        for (int i = 0; i < myIntArray.length; i++ ){
//            myIntArray[i] = k;
//            k+=1;
//        }
//        for (int element : myIntArray){
//            System.out.print(element);
//        }
//
//        System.out.println(Arrays.toString(myIntArray));

        int[] firstArray = getRandomArray(10);
        System.out.print(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.print(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(forthArray));

        String[] sArray = {"sam","john","ashwin","blesson","jerwin"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"sam") >= 0){
            System.out.println("Found sam in the List");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
