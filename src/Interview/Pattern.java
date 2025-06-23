package Interview;

public class Pattern {

    public static void main(String[] args){


        int n = 5;

        for (int i = 1; i <= n; i++){
            int t = i;

            for (int j = 1; j <= i ; j++){
                System.out.print(t + " ");

                t+=  n - j;
            }
            System.out.println();
        }

    }
}
