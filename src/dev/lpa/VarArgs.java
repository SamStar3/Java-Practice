package dev.lpa;

public class VarArgs {

    public static void main (String... args){
        System.out.println("hello world");

        String[] splitStrings = "Hello World".split(" ");
        printText(splitStrings);

        String[] aString = {"sam", "john","sowmi","sounder","elizabeth"};
        System.out.println(String.join("-",aString));
    }

    public static void printText(String... textList) {
        for(String s : textList) {
            System.out.println(s);
        }
    }
}
