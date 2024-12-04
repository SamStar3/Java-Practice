package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args){

        Deque<Integer> d = new LinkedList<>();

        d.addFirst(5);
        d.addLast(20);
        d.addFirst(0);
        d.addLast(30);

        for (int num : d){
            System.out.print(num + " " );
        }

        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
