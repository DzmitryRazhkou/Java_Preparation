package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurrenceOfWordInString {
    public static void main(String[] args) {
        String str = "This this is is IS Done done by done by Me";
        countWordsFirstWay(str);
        System.out.println("__________");
        countWordsSecondWay(str);
    }

    private static void countWordsFirstWay(String input) {
        if (Integer.valueOf(input.length()) == 1) {
            System.out.println(input + " -> " + 1);
        }

        Map<String, Integer> maps = new HashMap<>();
        String[] arrayOfWords = input
                .toLowerCase()
                .split(" ");

        for (String s : arrayOfWords) {
            if (maps.containsKey(s)) {
                maps.put(s, maps.get(s) + 1);
            } else {
                maps.put(s, 1);
            }
        }

        Set<String> keys = maps.keySet();
        for (String s : keys) {
            if (maps.get(s) > 1) {
                System.out.println(s + " -> " + maps.get(s));
            }
        }
    }

    private static void countWordsSecondWay(String input) {
        if (Integer.valueOf(input.length()) == 1) {
            System.out.println(input + " -> " + 1);
        }

        Map<String, Integer> maps = new HashMap<>();
        String[] arrayOfWords = input
                .toLowerCase()
                .split(" ");

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (maps.containsKey(arrayOfWords[i])) {
                int count = maps.get(arrayOfWords[i]);
                maps.put(arrayOfWords[i], count + 1);
            } else {
                maps.put(arrayOfWords[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> s : entries) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " -> " + s.getValue());
            }
        }
    }
}
