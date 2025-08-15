package practise_java_questions.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        String result = removeDuplicateCharacters(inputString.toLowerCase());

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + result);
    }

    private static String removeDuplicateCharacters(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char s : input.toCharArray()) {
            if (seen.add(s)) {
                result.append(s);
            }
        }
        return result.toString();
    }
}
