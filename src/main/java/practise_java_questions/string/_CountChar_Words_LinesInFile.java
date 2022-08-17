package practise_java_questions.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _CountChar_Words_LinesInFile {

//    Count total chars, words and lines in a given file
//    @param args

    static String path = "/Users/dzmitryrazhkou/Desktop/up.txt";

    public static void main(String[] args) throws IOException {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String currentLine = reader.readLine();

        while (currentLine != null) {
            lineCount++;

//            Words:
            String words[] = currentLine.split(" ");
            wordCount = wordCount + words.length;

//            Line:

            for (String w : words) {
                charCount = charCount + words.length;
            }
            currentLine = reader.readLine();

        }
        System.out.println("Total line: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);


    }
}
