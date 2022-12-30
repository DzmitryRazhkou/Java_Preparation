package practise_java_questions.arrays;

import java.util.Arrays;

public class _SecondLargestIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        secondMax(arr);
    }

    public static void secondMax(int[] array) {
        Arrays.sort(array);
        int n = array.length - 1;

        while (array[n] == array[array.length - 1]) {
            n--;
        }
        System.out.println(array[n]);
    }
}

