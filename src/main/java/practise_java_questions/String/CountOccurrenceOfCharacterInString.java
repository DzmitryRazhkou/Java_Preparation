package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfCharacterInString {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        Map<Character, Integer> characterCount = countCharacters(inputString.toLowerCase());
        System.out.println("Character occurrences in the string:");

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
    private static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> characterCount = new HashMap<>();

        for (char s : input.toCharArray()) {
            if (Character.isLetterOrDigit(s)) {
                characterCount.put(s, characterCount.getOrDefault(s, 0) + 1);
            }
        }
        return characterCount;
    }
}
