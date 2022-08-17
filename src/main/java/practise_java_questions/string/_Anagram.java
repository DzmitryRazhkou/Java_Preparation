package practise_java_questions.string;

import java.util.Arrays;

public class _Anagram {
    public static void main(String[] args) {
        String word1 = "State";
        String word2 = "Taste";
        boolean res = isAnagram(word1, word2);
        System.out.println(res);
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();

        String w_1 = w1.replaceAll("//s", " ");
        String w_2 = w2.replaceAll("//s", " ");

        char[] arr1 = w_1.toCharArray();
        char[] arr2 = w_2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
