package practise_java_questions.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};

        Arrays.sort(arr);
        int n = arr.length - 1;

        while(arr[n] == arr[arr.length - 1]){
            n--;
        }
        System.out.println(arr[n]);
    }
}
