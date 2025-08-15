package practise_java_questions.String;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aaaabbbbccc"));
    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> lastSeen = new HashMap<>();
        int best = 0;
        int left = 0; // start index of current window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                // Move left past the last occurrence of c
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
