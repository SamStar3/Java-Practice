package Queue;

public class CircularTour {

    static int circularTour(int[] a1, int[] a2) {
        // code here

        int totalGas = 0;
        int currGas = 0;
        int startIndex = 0;

        for(int i = 0; i < a1.length; i++){

            int net = a1[i] - a2[i];
            totalGas += net;
            currGas += net;

            if(currGas < 0 ){
                startIndex = i + 1;
                currGas = 0;
            }
        }

        return totalGas >= 0 ? startIndex : -1;
    }

    public static void main(String[] args){

        int a1[] = {4,6,7,4};
        int a2[] = {6,5,3,5};

        System.out.println(circularTour(a1,a2));
    }
}
