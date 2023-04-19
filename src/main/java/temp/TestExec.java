package temp;

import java.io.IOException;
import java.util.Arrays;

public class TestExec {
    public static void main(String[] args) throws IOException {
        int[] str = {0, 79, 12, 50, 7};
        insertOrder(str);
    }

    public static void insertOrder(int[] str) {
        for (int i = 0; i < str.length; i++) {
            int current = str[i];
            int j = i - 1;

            while (j >= 0 && str[j] > current) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = current;
        }
        System.out.println(Arrays.toString(str));
    }
}

