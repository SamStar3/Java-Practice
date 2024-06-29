package HashingDSA;

import java.util.*;

public class AccountMerge {


        // Function to find the root of the set
        public static List<List<String>> accountsMerge(List<List<String>> accounts) {
            // HashMap to store the count of votes for each candidate
            HashMap<String, String> parent = new HashMap<>();
            // Map from email to the owner name
            Map<String, String> emailToName = new HashMap<>();
            // Map from email to its own representative in Union-Find
            Map<String, String> emailToRepresentative = new HashMap<>();

            // Initializing the parent map for Union-Find
            for (List<String> account : accounts) {
                String name = account.get(0);
                for (int i = 1; i < account.size(); i++) {
                    String email = account.get(i);
                    parent.put(email, email);
                    emailToName.put(email, name);
                }
            }

            // Performing Union operation for all emails in the same account
            for (List<String> account : accounts) {
                String firstEmail = account.get(1);
                for (int i = 2; i < account.size(); i++) {
                    union(firstEmail, account.get(i), parent);
                }
            }

            // Finding the representative for each email
            for (String email : parent.keySet()) {
                String representative = find(email, parent);
                emailToRepresentative.putIfAbsent(representative, email);
            }

            // Merging emails that have the same representative
            Map<String, TreeSet<String>> mergedAccounts = new HashMap<>();
            for (String email : parent.keySet()) {
                String representative = find(email, parent);
                mergedAccounts.putIfAbsent(representative, new TreeSet<>());
                mergedAccounts.get(representative).add(email);
            }

            // Preparing the result
            List<List<String>> result = new ArrayList<>();
            for (String representative : mergedAccounts.keySet()) {
                List<String> mergedAccount = new ArrayList<>(mergedAccounts.get(representative));
                mergedAccount.add(0, emailToName.get(representative));
                result.add(mergedAccount);
            }

            return result;
        }

    // Helper function to find the representative of a set (with path compression)
    private static String find(String email, Map<String, String> parent) {
        if (!email.equals(parent.get(email))) {
            parent.put(email, find(parent.get(email), parent));
        }
        return parent.get(email);
    }

    // Helper function to union two sets
    private static void union(String email1, String email2, Map<String, String> parent) {
        String root1 = find(email1, parent);
        String root2 = find(email2, parent);
        if (!root1.equals(root2)) {
            parent.put(root2, root1);
        }
    }
}
//    public static void main(String[] args) {
//        // Example usage
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();  // consume the newline
//        List<List<String>> accounts = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int size = scanner.nextInt();
//            scanner.nextLine();  // consume the newline
//            List<String> account = new ArrayList<>();
//            for (int j = 0; j < size; j++) {
//                account.add(scanner.next());
//            }
//            accounts.add(account);
//        }
//        List<List<String>> result = AccountMerge.accountsMerge(accounts);
//        for (List<String> account : result) {
//            System.out.println(account);
//        }
//    }


//}
