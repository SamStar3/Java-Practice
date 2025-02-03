package NestedClasses;

import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator){
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for(var employee : list){
            System.out.println(employee);
        }
    }
}
