package Queue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class QueueReversal {

    static Queue<Integer> rev(Queue<Integer> q){
        //add code here.

        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(rev(q));
    }
}
