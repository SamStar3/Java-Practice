package Queue;

import java.util.LinkedList;
import java.util.Queue;
public class ReversingQueue {

    static void reverse(Queue<Integer> q){
        if (q.isEmpty()){
            return;
        }
        int x = q.remove();
        reverse(q);
        q.offer(x);

        System.out.println(q);
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        reverse(q);
    }
}
