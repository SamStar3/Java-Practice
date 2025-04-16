package Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args){

        String[] names = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};

        for (int i = 0; i < names.length; i++){
            for (int j = i + 1; j < names.length; j++){
                if (names[i].equals(names[j])){
                    System.out.println("DuplicateElements is : " + names[j]);

                }
            }
        }

        Set<String> store = new HashSet<>();

        for (String name : names){
//            store.add(name);
            if (store.add(name) == false){
                System.out.println(name);
            }
        }
    }
}
