package temp;

import javax.management.MBeanAttributeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RANDOM {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
       reverse(arr, arr.length);
    }


    public static void reverse(int[]arr, int n) {
        int[]new_arr = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            new_arr[j - 1] = arr[i];
            j = j - 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(new_arr[i]);
        }

    }
    }



