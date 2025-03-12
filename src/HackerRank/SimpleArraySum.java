package HackerRank;


import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SimpleArraySum {
    static int simpleArraySum(List<Integer> ar) {
        int sum = 0; // Initialize sum
        for (int i = 0; i < ar.size(); i++) { // Loop through all elements
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = simpleArraySum(ar); // Call method directly

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}