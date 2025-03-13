package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
//        sc.next();
        Map<String,Integer> map = new HashMap<>();

        for (int i = 1; i <= count; i++) {
            System.out.println("Give the " + i + " Person Name");
            String key = sc.next();
            System.out.println("Give the " + i + " Person Salary");
            int value = sc.nextInt();
            map.put(key, value);
        }

        System.out.println(map);


        System.out.println("Sams person Salary is " + map.get("sam"));

        System.out.println("Rams person Salary is " + map.get("ram"));

        System.out.println("Total Average is " + ((map.get("sam") + map.get("ram")) / 2));
    }
}
