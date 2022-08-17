package practise_java_questions.character;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args) {
        printDuplicateCharacter("seeeetttt");
    }

    public static void printDuplicateCharacter(String str){
        if (str == null){
            System.out.println("Null String");
            return;
        }
        if (str.isEmpty()) {
            System.out.println("Empty String");
        }
        if (str.length() == 1) {
            System.out.println("Single String");
            return;
        }

        char[] words = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character ch: words){
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            }
            else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry: entrySet){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+ " " +entry.getValue());
            }
        }

    }


}
