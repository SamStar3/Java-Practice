package dev.lpa;

import java.util.Arrays;

public class References {
    public static void main(String[] args) {

        int[] array = new int[5];
        int[] newArray = array;
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(array));

        newArray[0] = 5;
        modifyArray(newArray);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }

    public static void modifyArray(int[] array) {
        array[2] = 3;
    }
}
