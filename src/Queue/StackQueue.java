package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    static void reverse(Queue<Integer> queue){

        Stack<Integer> s = null;

        while (queue.isEmpty()== false){
            s.push(queue.remove());
        }

        while (s.isEmpty() == false){
            queue.add(s.pop());
        }
        System.out.println(queue);
    }


    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        reverse(q);
    }
}
