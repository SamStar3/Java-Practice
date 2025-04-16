package Interview;

public class SmallestLargest {

    public static void main(String[] args){

        int[] numbers = {4,5235,5353,3,3,12,9};
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }else if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }
}
