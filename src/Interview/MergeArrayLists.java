package Interview;

import java.util.ArrayList;

public class MergeArrayLists {

    public static void main(String[] args){

        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(10);
        ls1.add(20);
        ls1.add(30);
        ls1.add(40);
        ls1.add(50);
        ls1.add(60);
        ls1.add(70);
        ls1.add(80);
        ls1.add(90);
        ls1.add(100);

        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(110);
        ls2.add(120);
        ls2.add(130);
        ls2.add(140);
        ls2.add(150);
        ls2.add(160);
        ls2.add(170);
        ls2.add(180);
        ls2.add(190);
        ls2.add(200);

        ls1.addAll(ls2);

        System.out.println("Merged ArrayList: " + ls1);
    }
}
