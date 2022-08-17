package preparation.integer;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]as = {1, 9, 7, 12, 90, 125};
        for (int i = as.length-1; i >= 0; i--) {
            System.out.println(as[i]);
        }

        int index = 3;
        int value = 199;
        as[index] = value;
        System.out.println(Arrays.toString(as));
    }
}
