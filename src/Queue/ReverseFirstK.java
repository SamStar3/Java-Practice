package Queue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;


public class ReverseFirstK {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.

        Stack<Integer> s = new Stack<>();

        int i = 0;

        while(i!=k){

            s.push(q.remove());
            i++;
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        int rem = q.size() - k;

        for(int j = 0; j < rem; j++){
            q.add(q.poll());
        }
        return q;
    }
    public static void main(String[] args){


        ReverseFirstK gfg = new ReverseFirstK();
        Queue<Integer> queue = new LinkedList<>();

        // Example Input
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        // Add elements to the queue
        for (int num : arr) {
            queue.add(num);
        }

        System.out.println("Original Queue: " + queue);

        Queue<Integer> modifiedQueue = gfg.modifyQueue(queue, k);

        System.out.println("Modified Queue: " + modifiedQueue);

    }
}
