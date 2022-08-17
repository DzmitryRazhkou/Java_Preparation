package preparation.integer;

import java.util.*;

public class DuplicateNumbersArrayArrayListSet {
    public static void main(String[] args) {
        Integer[] numbers = {1, 6, 7, 12, 15, 19, 20, 1 ,7};
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
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
