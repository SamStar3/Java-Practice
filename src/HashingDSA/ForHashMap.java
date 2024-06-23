package HashingDSA;

import java.util.HashMap;
import java.util.Map;

public class ForHashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<String , Integer>();

        m.put("sam",10);
        m.put("john",15);
        m.put("ashwin",20);

        System.out.println(m);
        System.out.println(m.size());

        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        HashMap<String, Integer> m1
                = new HashMap<>();

        // Add elements to the map
        m1.put("gfg", 10);
        m1.put("ide", 15);
        m1.put("courses", 20);

        // Check for a key
        if (m1.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");
        System.out.println(m.size());
    }
}
