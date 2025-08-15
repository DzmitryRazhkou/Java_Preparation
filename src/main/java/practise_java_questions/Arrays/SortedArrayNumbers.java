package practise_java_questions.Arrays;

import java.util.Arrays;

public class SortedArrayNumbers {
    public static void main(String[] args) {
        int[] str = {0, 79, 12, 50, 7};
        insertionSort(str);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
