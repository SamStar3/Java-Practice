package dev.lpa;

import com.abc.first.Item;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Item firstItem = new Item("burger");
//        System.out.println(firstItem);

        com.abc.first.Item secondItem = new com.abc.first.Item("Burger");
        System.out.println(secondItem);

        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
        int k = 1;
        for (int i = 0; i < myIntArray.length; i++ ){
            myIntArray[i] = k;
            k+=1;
        }
        for (int element : myIntArray){
            System.out.print(element);
        }

        System.out.println(Arrays.toString(myIntArray));
    }
}
