package Interview;

public class PatterPrinting {

    public static void main(String[] args){


//        System.out.println("PattenPrinting");

        String[] str = {"abc","def","ghi"};
        int n = 5;
        int row = str.length;

        for (int i = 0; i < n; i ++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            System.out.print("*");
            System.out.print(str[i]);
            System.out.println("*");
        }

        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
}
