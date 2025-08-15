package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "appiuM XCUITest Cypress";
        char result = findFirstNonRepeatedCharacter(inputString.toLowerCase());

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        }
    }

    private static char findFirstNonRepeatedCharacter(String input) {
        Map<Character, Integer> maps = new HashMap<>();

        for (char s : input.toCharArray()) {
            maps.put(s, maps.getOrDefault(s, 0) + 1);
        }

        for (char y : input.toCharArray()) {
            if (maps.get(y) == 1) {
                return y;
            }
        }
        // If no non-repeated character is found, return a default value (you can modify as needed)
        return '\0';
    }
}
