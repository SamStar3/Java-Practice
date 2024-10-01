package Campus;

public class ReverseInWhile {

    public static void main(String[] args){

        String str = "Hello World";

        int len = str.length() - 1;
        while (len >= 0) {
            System.out.print(str.charAt(len));
            len--;
        }
    }
}
