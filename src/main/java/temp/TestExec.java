package temp;

import java.io.IOException;

public class TestExec {
    public static void main(String[] args) throws IOException {
        int[] r = {1, 7, -5, 25, 0, 17, 35, 56, 88, 14, 5, 5, 9, 12, 7};
        for (int i = 0; i < r.length; i++) {
            if (r[i] % 2 != 0) {
                System.out.println(r[i]);
            }
        }
    }

    public static void remove(int a[]) {
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            avg = sum / a.length;
        }
        System.out.println(avg);
    }
}


