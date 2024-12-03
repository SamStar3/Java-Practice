package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {

    static ArrayList<String> generate(int n) {
        // Your code here

        Queue<String> q = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();

        q.add("1");

        for(int i = 0; i < n; i++){
            String res = q.poll();
            arr.add(res);
            q.add(res + "0");
            q.add(res + "1");
        }

        return arr;
    }


    public static void main(String[] args){

        int n = 5;
        ArrayList<String> binaryNumbers = generate(n);
        System.out.println("Binary numbers from 1 to " + n + ": " + binaryNumbers);
    }
}
