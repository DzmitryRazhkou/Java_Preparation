package preparation.integer;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        int n = arr.length - 1;

        while (arr[n] == arr[arr.length - 1]) {
            n--;
        }
        System.out.println(arr[n]);
    }
}
