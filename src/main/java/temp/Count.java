package temp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count {

    static String path = "/Users/dzmitryrazhkou/Documents/Automation/Java_InterviewQuestions/src/main/java/temp/demo.txt";

    public static void main(String[] args) throws IOException {

        int word_count = 0;
        int char_count = 0;
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String c_line = bufferedReader.readLine();

        while (c_line != null){
            count++;

        String words[] = c_line.split(" ");
        word_count = word_count + words.length;

        for (String s: words){
            char_count = char_count + words.length;
        }
        c_line = bufferedReader.readLine();
    }
        System.out.println("Total line: " + count);
        System.out.println("Words: " + word_count);
        System.out.println("Chars: " + char_count);


}}
