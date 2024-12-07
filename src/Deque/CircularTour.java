package Deque;

public class CircularTour {



    static int firstPetrolPump(int petrol[], int dist[], int n){

        for (int start = 0; start < n; start++){

            int currPump = 0;
            int end = start;
            while (true){
                currPump += petrol[end] - dist[end];
                if (currPump < 0){
                    break;
                }
                end = (end + 1) % n;

                if (end == start){
                    return start+1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args){

        int petrol[] = {4, 6, 5,7};
        int dist[] = {3,5,8,9};
        int n = petrol.length;

        System.out.println(firstPetrolPump(petrol, dist,n));

    }
}
