package practise_java_questions.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWithSpaces {
    public static void main(String[] args) {
        String input = "This is a string";
        System.out.println("Input:    " + input);
//        System.out.println("Reversed: " + reversePreserveSpaces(input));
        fs(input);
    }


    public static String reversePreserveSpacesTwoPointers(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Skip spaces from the left
            if (chars[left] == ' ') {
                left++;
            }
            // Skip spaces from the right
            else if (chars[right] == ' ') {
                right--;
            }
            // Swap letters
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static String reversePreserveSpaces(String input) {
        List<Character> letters = new ArrayList<>();

        // Step 1: Collect all non-space characters
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                letters.add(c);
            }
        }

        // Step 2: Reverse the list
        Collections.reverse(letters);

        // Step 3: Rebuild string with spaces preserved
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else {
                result.append(letters.get(index++));
            }
        }

        return result.toString();
    }

    public static void fs(String string) {
        List<Character> letters = new ArrayList<>();

        for (char s : string.toCharArray()) {
            if (s != ' ') {
                letters.add(s);
            }
        }

        Collections.reverse(letters);

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char s: string.toCharArray()) {
            if (s == ' ') {
                sb.append(" ");
            } else {
                sb.append(letters.get(count++));
            }
        }
        System.out.println(sb.toString());

    }
}
