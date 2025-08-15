package practise_java_questions.Arrays;

public class ReverseArrayNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        reverseArray(arr, arr.length);
    }

    public static void reverseArray(int[] array, int numberSize) {
        int[] reversedArray = new int[numberSize];
        int temp = numberSize;

        for (int i = 0; i < numberSize; i++) {
            reversedArray[temp - 1] = array[i];
            temp--;
        }

        for (int p = 0; p < numberSize; p++) {
            System.out.print(reversedArray[p] + " ");
        }
    }

}
