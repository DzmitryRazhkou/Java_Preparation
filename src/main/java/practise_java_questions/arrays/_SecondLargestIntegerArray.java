package practise_java_questions.arrays;

import java.util.Arrays;

public class _SecondLargestIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        secondMaxElementArrayFirstMethod(arr);
        secondMaxElementArraySecondMethod(arr);
    }

    public static void secondMaxElementArrayFirstMethod(int[] array) {
        Arrays.sort(array);
        int n = array.length - 1;

        while (array[n] == array[array.length - 1]) {
            n--;
        }
        System.out.println("Second Maximum Element From Array First Method: "+array[n]);
    }
    public static void secondMaxElementArraySecondMethod(int[] array) {
        int max1 = array[0];
        int max2 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2 && array[i] != max1) {
                max2 = array[i];
            }
        }
        System.out.println("Second Maximum Element From Array Second Method: " + max2);
    }
}

