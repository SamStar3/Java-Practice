package StringFormatting;

public class AllAboutStrings {
    public static void main(String[] args){

        printInformation("Hello Sam");
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
    }
}
