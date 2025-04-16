package Interview;

import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args){

        String str = "The rains have start here";
        String str1 = "The rains Have start here";

        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s',str.indexOf('s')+1));

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("hello"));

        System.out.println(str.equals(str1));

        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str.substring(0,9));

        String s = "   Hello World   ";

        System.out.println(s.trim());

        System.out.println(s.replace(" ", ""));

        String date = "12-03-2014";

        System.out.println(date.replace("-", "/"));

        String test = "Hello-World-test-selenium";

        String[] tes = test.split("-");

        System.out.println(Arrays.toString(tes));

        String s2 = "care";

        System.out.println(s2.concat("s"));

        String x = "hello";
        String y = "world";

        int a =100;
        int b = 200;

        System.out.println(a+b+x+y);

        System.out.println(x+y+a+b);

        System.out.println(x+y+(a+b));
    }
}
