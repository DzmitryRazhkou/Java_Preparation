package practise_java_questions.String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _CountChar_Words_LinesInFile {
        static String path = "/Users/dzmitryrazhkou/Desktop/sp.txt";

    public static void main(String[] args) throws IOException {
        countLineWordChars(path);
    }

    public static void countLineWordChars(String path) throws IOException {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        while ((line = reader.readLine()) != null) {
            lineCount++;

            charCount += line.length() + 1;
            String[] words = line.trim().split("\\s+");

            if (!line.trim().isEmpty()) {
                wordCount += words.length;
            }
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
