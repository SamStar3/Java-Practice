package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapScreen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        // Accept 10 key-value pairs from user
        System.out.println("Enter 10 key-value pairs (Integer key, String value):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter key (Integer): ");
            int key = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter value (String): ");
            String value = scanner.nextLine();
            map.put(key, value);
        }

        // Remove entries where string length > 10
        map.entrySet().removeIf(entry -> entry.getValue().length() > 10);

        // Display the filtered map
        System.out.println("\nFiltered Map (String length ≤ 10):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
