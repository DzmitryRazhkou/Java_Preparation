package practise_java_questions.String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _MaxWordCountFile {

    static String cbkPath = "/Users/dzmitryrazhkou/Downloads/lyrics.txt";

    public static void main(String[] args) throws IOException {
        countWordsInFile(cbkPath);

    }
    public static void countWordsInFile(String path) throws IOException {
        Map<String, Integer> maps = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] words = currentLine.toLowerCase().split(" ");
            for (String w : words) {
                if (w.trim().isEmpty()) continue; // skip empty words (e.g. double spaces)
                maps.put(w, maps.getOrDefault(w, 0) + 1);
            }
        }

        reader.close(); // Always close your readers!

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " >--->---> " + entry.getValue());
            }
        }
    }
}
