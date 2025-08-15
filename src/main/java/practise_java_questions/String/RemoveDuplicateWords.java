package practise_java_questions.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String inputSentence = "This is a sample sentence with duplicate words. This is a sample sentence.";
        String resultSentence = removeDuplicates(inputSentence);
        System.out.println("Sentence after removing duplicates: " + resultSentence);
    }

    private static String removeDuplicates(String input) {
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        Set<String> uniqueWord = new HashSet<>();
        for (String s : words) {
            if (uniqueWord.add(s)) {
                sb.append(s).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
