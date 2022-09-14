package practise_java_questions.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_NumberOfDuplicateWords {

//    Hey java is java is teh best lag java

    public static void main(String[] args) {
        findDuplicate("Hey java is java is teh best lag java");
    }

    public static void findDuplicate(String input) {

//    split
        String words[] = input.split(" ");

//    create a HashMap
        Map<String, Integer> wordsCount = new HashMap<>();

//    to check each word to given array
        for (String v : words) {
            if (wordsCount.containsKey(v)) {
                wordsCount.put(v.toLowerCase(), wordsCount.get(v) + 1);
            } else {
                wordsCount.put(v, 1);
            }
        }

//    extract all keys from HashMao:
        Set<String> wordsInString = wordsCount.keySet();

//   loop thru all words in wordCount
        for (String s : wordsInString) {
            if (wordsCount.get(s) > 1) {
                System.out.println(s + " : " + wordsCount.get(s));
            }
        }
    }
}
