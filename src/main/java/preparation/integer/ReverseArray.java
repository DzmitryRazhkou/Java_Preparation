package preparation.integer;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] as = {1, 9, 7, 12, 90, 125};
        reverse(as, as.length);
    }

    public static void reverse(int[] arr, int n) {
        int[] rev_arr = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            rev_arr[j - 1] = arr[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(rev_arr[k]);
        }
    }

}

