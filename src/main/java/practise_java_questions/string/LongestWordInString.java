package practise_java_questions.string;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInString {
    public static void main(String[] args) {
        String input = "Being a conductor of a big orchestra, it's an extremely demanding job.";
        String longestWord = Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length)).orElse(input).toString();
        System.out.println("Longest: " +longestWord);
    }
}
