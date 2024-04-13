public class maxDiff {

    int maxDifference(int arr[],int arrlength){
        int max_diff = arr[1] - arr[0];
        int i,j;
        for(i=0; i<arrlength;i++){
            for(j=i+1;j<arrlength;j++){
                if(arr[j] - arr[i] > max_diff){
                    max_diff = arr[j] - arr[i];
                }
            }
        }
        return max_diff;
    }
    public static void main(String[] args){
        maxDiff maxDif = new maxDiff();
        int arr[] = {1,2,90,10,100};
        System.out.println("Maximum difference is " + maxDif.maxDifference(arr,5));
    }
}

