package practise_java_questions.arrays;

import java.util.Arrays;

// Method 1

public class MaxNumberArraySort {
    public static void main(String[] args) {
        int[] arr = {6, 90, 12, 15, 50, 19, 3, 9};
        for (int x : arr) {
            System.out.print(x + " ");
        }
            Arrays.sort(arr);
            System.out.println("\n----------");

            for (int y : arr) {
                System.out.print(y + " ");
            }
            int maxNumber = arr[arr.length-1];
        System.out.println("The largest number is: " +maxNumber);

        }
    }
