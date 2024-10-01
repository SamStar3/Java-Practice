package Campus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.StringTemplate.STR;

//import static java.lang.StringTemplate.STR;

public class Characters {

    static void letterCharacters(String input, String pattern, String label)
    {
        Pattern comiledPattern = Pattern.compile(pattern);
        Matcher matcher = comiledPattern.matcher(input);
        System.out.println(STR."\{label}:");
        while (matcher.find()) {
            System.out.print(STR."\{matcher.group()} ");
//            System.out.println(matcher.group().length());
        }

        System.out.println();
    }
    public static void main(String[] arg)
    {
        String input = "Hello123! World@2024";
        String vowelPattern = "[aeiouAEIOU]";
        String consonantPattern = "[a-zA-Z&&[^aeiouAEIOU]]";
        String digitPattern = "\\d";
        String specialCharPattern = "[^a-zA-Z0-9]";

        letterCharacters(input, vowelPattern, "Vowels");
        letterCharacters(input, consonantPattern, "Consonant");
        letterCharacters(input, digitPattern, "Digit");
        letterCharacters(input, specialCharPattern, "Special");
    }

}
