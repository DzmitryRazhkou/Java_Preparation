package practise_java_questions.character;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterDuplicate {
    public static void main(String[] args) {
        duplicateCharacter("You are always up coming up with excuses not having your work done");
    }

    public static void duplicateCharacter(String str) {
        char[] words = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for (Map.Entry<Character, Integer> s : entry) {
            if (s.getValue() > 1) {
                System.out.println(s.getKey() + ": " + s.getValue());
            }
        }
    }
}
