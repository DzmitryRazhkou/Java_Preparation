package practise_java_questions.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _MaxWordCountFile {

    static String path = "/Users/dzmitryrazhkou/Desktop/lyrics.txt";

    public static void main(String[] args) throws IOException {

        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(path));
        String currentLine = reader.readLine();

        while (currentLine != null) {
            String words[] = currentLine.toLowerCase().split(" ");
            for (String w : words) {
                if (wordMap.containsKey(w)) {
                    wordMap.put(w, wordMap.get(w) + 1);  // If HashMap has this word, skip to next word from string.
                } else {
                    wordMap.put(w, 1);   // Add word in the Map.
                }
            }
            currentLine = reader.readLine();   // For starting a new line,
        }
        wordMap.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Integer> maxMap = new HashMap<String, Integer>();

        wordMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
                .forEach(e -> maxMap.put(e.getKey(), e.getValue()));

        System.out.println("____________");
        System.out.println(maxMap);
    }

}
