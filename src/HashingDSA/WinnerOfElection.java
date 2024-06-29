package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfElection {


    static String[] winner(String arr[], int n) {
        HashMap<String, Integer> voteCount = new HashMap<>();

        for (String name : arr) {
            voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
        }

        String maxCandidate = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(maxCandidate) < 0)) {
                maxVotes = votes;
                maxCandidate = candidate;
            }
        }

        return new String[] { maxCandidate, String.valueOf(maxVotes) };
    }
    public static void main(String[] args) {

        int n = 13;
        String arr[] = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        String[] result = winner(arr, n);
        System.out.println(result[0] + " " + result[1]);
    }
}
