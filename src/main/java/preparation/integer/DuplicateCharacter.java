package preparation.integer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args) {
        duplicateCharacter("You are always up coming up with excuses not having your work done");
    }

    public static void duplicateCharacter(String str) {
        char[] words = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character f : words) {
            if (map.containsKey(f)) {
                map.put(f, map.get(f) + 1);
            } else {
                map.put(f, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> ent : entrySet) {
            if (ent.getValue() > 1) {
                System.out.println(ent.getKey() + " | " + ent.getValue());
            }
        }

    }
}
