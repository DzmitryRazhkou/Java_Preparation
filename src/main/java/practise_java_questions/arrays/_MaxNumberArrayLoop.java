package practise_java_questions.arrays;

public class _MaxNumberArrayLoop {
    public static void main(String[] args) {
        int[] arr = {1,5 ,9, 12, 25, 35};

//        Maximum Number:

        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println("The Largest number is: " +maxNumber);

//        Minimum:

        int minNumber = arr[0];

        for (int i = arr.length-1; i > 0; i--){
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.println("The Smallest number is: " +minNumber);
    }
}
