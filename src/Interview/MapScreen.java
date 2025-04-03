package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapScreen {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Map<Integer, String> map = new HashMap<>();
//
//        System.out.println("Enter 10 key-value pairs (Integer key, String value):");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter key (Integer): ");
//            int key = scanner.nextInt();
//            scanner.nextLine();  // Consume newline
//            System.out.print("Enter value (String): ");
//            String value = scanner.nextLine();
//            map.put(key, value);
//        }
//
//        // Remove entries where string length > 10
//        map.entrySet().removeIf(entry -> entry.getValue().length() > 10);
//
//        // Display the filtered map
//        System.out.println("\nFiltered Map (String length ≤ 10):");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//
//        scanner.close();
//    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 5; i++){
            System.out.print("Enter the Key value");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the value ");
            String value = sc.nextLine();

            map.put(key,value);
        }

//        System.out.println(map.get(4));
        map.entrySet().removeIf(entry -> entry.getValue().length() > 10);

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
