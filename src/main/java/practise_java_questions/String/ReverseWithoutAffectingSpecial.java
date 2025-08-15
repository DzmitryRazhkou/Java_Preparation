package practise_java_questions.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWithoutAffectingSpecial {
    public static void main(String[] args) {
        String input = "a,b$c";
        System.out.println("Input:    " + input);
        System.out.println("Reversed: " + reverseOnlyLetters(input));
    }


    public static String reverseOnlyLetters(String input) {
        List<Character> letters = new ArrayList<>();

        // Step 1: Collect all letters
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        // Step 2: Reverse the collected letters
        Collections.reverse(letters);

        // Step 3: Rebuild the string
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.get(index++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
