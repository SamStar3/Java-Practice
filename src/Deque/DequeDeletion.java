package Deque;

import java.util.Iterator;
import java.util.ArrayDeque;

public class DequeDeletion {

    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // Your code here

        if(X >= 0 && X < deq.size()){

            int index = 0;
            Iterator<Integer> it = deq.iterator();

            while(it.hasNext()){
                it.next();
                if(index == X){
                    it.remove();
                    break;
                }
                index++;
            }
        }
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if(start >= 0 && start < end && end <= deq.size()){
            int index = 0;
            Iterator<Integer> it = deq.iterator();
            while(it.hasNext()){
                it.next();
                if(index >= start && index < end ){
                    it.remove();
                }
                if(index >= end){
                    break;
                }
                index++;
            }
        }
    }

    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}
