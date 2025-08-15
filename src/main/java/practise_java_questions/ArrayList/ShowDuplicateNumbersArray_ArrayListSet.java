package practise_java_questions.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowDuplicateNumbersArray_ArrayListSet {
    public static void main(String[] args) {
        Integer[] numbers = {1, 6, 7, 12, 15, 19, 20, 1, 7};
        showDuplicateNumbersArray(numbers);
    }

    public static void showDuplicateNumbersArray(Integer[] numbers) {
        List<Integer> list = Arrays.asList(numbers);
        Set<Integer> set = new HashSet<>(list);

        for (Integer s : set) {
            int count = 0;
            for (Integer l : list) {
                if (s == l) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(s);
            }
        }
    }
}
