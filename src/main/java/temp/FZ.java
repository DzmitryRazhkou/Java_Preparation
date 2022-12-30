package temp;

import java.io.IOException;
import java.util.Arrays;

public class FZ {
    public static void main(String[] args) throws IOException {
        boolean res = anag("Task", "Askt");
        System.out.println(res);
    }

    private static boolean anag(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();

        String a1 = w1.replaceAll("//s", " ");
        String a2 = w2.replaceAll("//s", " ");

        char[]c1 = a1.toCharArray();
        char[]c2 = a2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}




