package practise_java_questions.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {12, 87, 90, 87, 15, 75, 15};
        String s = findDuplicatesArrayElements(array);
        System.out.println(s);

        showDuplicatesElementsArray(array);
    }

    private static String findDuplicatesArrayElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        StringBuilder duplicates = new StringBuilder();

        for (int s : array) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.append(entry.getKey()).append(" ");
            }
        }
        return duplicates.toString();
    }

    private static void showDuplicatesElementsArray(int[] array) {
        Set<Integer> store = new HashSet<>();
        System.out.println("Duplicate: ");

        for (Integer s : array) {
            if (!store.add(s)) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }
}
