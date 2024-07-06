package StringsDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseSpecificSort {

    static String caseSpecific(String str) {

        List<Character> lowercase = new ArrayList<>();
        List<Character> uppercase = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercase.add(ch);
            } else {
                uppercase.add(ch);
            }
        }

        Collections.sort(lowercase);
        Collections.sort(uppercase);

        StringBuilder result = new StringBuilder();
        int lowercaseIndex = 0;
        int uppercaseIndex = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(lowercase.get(lowercaseIndex++));
            } else {
                result.append(uppercase.get(uppercaseIndex++));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
//        int N = 12;
        String str = "defRTSersUXI";

        System.out.println(caseSpecific(str));
    }
}
