package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;

public class WordsWithEvenCount {
    public static void main(String[] args) {
        String text = "This is a simple example Chinese Radicals 汉字偏旁部首. Example $@ words have even count.";
        countWordsWithEvenCount(text);
    }

    private static void countWordsWithEvenCount(String str) {
        String modified = str
                .replaceAll("[^a-zA-Z ]", "")
                .toLowerCase();

        String[] arrayOfWords = modified.split("\\s+");
        Map<String, Integer> maps = new HashMap<>();

        for (String s : arrayOfWords) {
            maps.put(s, maps.getOrDefault(s, 0) + 1);
        }

        // Print words with even count
        System.out.println("Words with Even Count:");
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.println(entry.getKey().trim());
            }
        }
    }
}
