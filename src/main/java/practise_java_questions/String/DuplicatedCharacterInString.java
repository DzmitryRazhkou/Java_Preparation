package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatedCharacterInString {
    public static void main(String[] args) {
        String inputString = "Appium XCUITest Cypress";
        countDuplicatedCharacters(inputString);
    }

    private static void countDuplicatedCharacters(String input) {
        input = input.toLowerCase();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char s : input.toCharArray()) {
            charFrequencyMap.put(s, charFrequencyMap.getOrDefault(s, 0) + 1);
        }

        Set<Character> keys = charFrequencyMap.keySet();
        for (Character s : keys) {
            if (charFrequencyMap.get(s) > 1) {
                System.out.println(s + " -> " + charFrequencyMap.get(s));
            }
        }
    }

    public static void findDuplicate(String input) {

//        Split:
        String words[] = input.split(" ");

//        Create a HashMap:
        Map<String, Integer> wordsCount = new HashMap<>();

//        To check each word to given array:
        for (String v : words) {
            if (wordsCount.containsKey(v)) {
                wordsCount.put(v.toLowerCase(), wordsCount.get(v) + 1);
            } else {
                wordsCount.put(v, 1);
            }
        }

//        Extract all keys from HashMap:
        Set<String> wordsInString = wordsCount.keySet();

//        Loop thru all words in wordCount:
        for (String s : wordsInString) {
            if (wordsCount.get(s) > 1) {
                System.out.println(s + " : " + wordsCount.get(s));
            }
        }
    }
}
