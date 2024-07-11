package StringsDSA;

public class KeypadTyping {

    static String printNum(String s ) {

        char[] map = new char[26];
        int n = s.length();

        map['a' - 'a'] = '2'; map['b' - 'a'] = '2'; map['c' - 'a'] = '2';
        map['d' - 'a'] = '3'; map['e' - 'a'] = '3'; map['f' - 'a'] = '3';
        map['g' - 'a'] = '4'; map['h' - 'a'] = '4'; map['i' - 'a'] = '4';
        map['j' - 'a'] = '5'; map['k' - 'a'] = '5'; map['l' - 'a'] = '5';
        map['m' - 'a'] = '6'; map['n' - 'a'] = '6'; map['o' - 'a'] = '6';
        map['p' - 'a'] = '7'; map['q' - 'a'] = '7'; map['r' - 'a'] = '7'; map['s' - 'a'] = '7';
        map['t' - 'a'] = '8'; map['u' - 'a'] = '8'; map['v' - 'a'] = '8';
        map['w' - 'a'] = '9'; map['x' - 'a'] = '9'; map['y' - 'a'] = '9'; map['z' - 'a'] = '9';

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(map[s.charAt(i) - 'a']);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.print(printNum(s));
    }
}
