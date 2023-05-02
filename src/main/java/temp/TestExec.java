package temp;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestExec {
    public static void main(String[] args) throws IOException {
        String str = "You are always up coming up with excuses not having your work done";
        insertOrder(str);
    }

    public static void insertOrder(String str) {
        char[] array = str.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(array);
        Map<Character, Integer> maps = new HashMap<>();

        for (char s : array) {
            if (maps.containsKey(s)) {
                maps.put(s, maps.get(s) + 1);
            } else {
                maps.put(s, 1);
            }
        }
        Set<Character> set = maps.keySet();
        for (Character s : set) {
            if (maps.get(s) > 1) {
                System.out.println(s + " -> " + maps.get(s));
            }
        }
    }
}

