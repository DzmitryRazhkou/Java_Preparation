package practise_java_questions.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ascending_Descending {
    public static void main(String[] args) {
//        Integer[]arr = {7, 9, 12, 15, 90, 55};
        String[]arr = {"James", "Lew", "Well"};
        Arrays.sort(arr);

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
