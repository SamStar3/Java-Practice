package HashingDSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ForHashSet {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();

        h.add("sam");
        h.add("john");
        h.add("ashwin");

        System.out.println(h);

        System.out.println(h.contains("ashwin"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        h.remove("ashwin");
        System.out.println(h.size());

        HashSet<ArrayList> set = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);

        System.out.println(set.size());

        System.out.println(set);
    }
}
