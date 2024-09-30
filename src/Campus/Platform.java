package Campus;

public class Platform {

    public static void main(String[] args){


        double arr1[] = {9.00,9.40,9.50,11.00,15.00,18.00};
        double arr2[] = {9.10,12.00,11.20,11.30,19.00,20.00};
//        double arr1[] = {9.00,9.40};
//        double arr2[] = {9.10,12.00};
        int count = 1;
        int res = 1;

        for (int i = 0; i < arr1.length; i++){
            for (int j = i + 1; j < arr1.length; j++){
                if(arr2[i] > arr1[j]){
                    count++;
                }else {
                    res = Math.max(count,res);
                    count = 1;
                }
            }
        }
        System.out.println(res);
    }
}
