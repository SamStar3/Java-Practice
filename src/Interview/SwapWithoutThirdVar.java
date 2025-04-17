package Interview;

public class SwapWithoutThirdVar {

    public static void main(String[] args){

        int a = 5;
        int b = 10;

//        a = a + b;
//        b = a - b;
//        a = a - b;

//        a = a*b;
//        b = a/b;
//        a = a/b;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
}
