package PracticeW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

//import static com.sun.tools.javac.main.Option.O;

public class Regex {

    public static void main(String[] args) {

    String input = "Hello World! ";
    String pattern = "/b/w/b";
            Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(input);
    int count = 0;
while(m.find())

    {
        count++;
        System.out.println(count);
    }
}
}
