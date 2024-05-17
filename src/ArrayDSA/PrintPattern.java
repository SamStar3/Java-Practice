package ArrayDSA;

import java.util.ArrayList;
import java.util.List;
public class PrintPattern {

    public List<Integer> pattern(int N) {
        List<Integer> result = new ArrayList<>();
        int K = N+1;
        if(N <  0){
            result.add(N);
            return result;
        }
        if (N <= 0) {
            result.add(0);
            return result;
        }

        while (N > 0) {
            result.add(N);
            N -= 5;
        }
        while (N < K) {
            result.add(N);
            N += 5;
        }
        return result;
    }
    public static void main(String[] args) {
        PrintPattern printpattern = new PrintPattern();
        int N = 4;
        List<Integer> result = printpattern.pattern(N);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
