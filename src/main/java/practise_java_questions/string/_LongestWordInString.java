package practise_java_questions.string;

import java.util.ArrayList;
import java.util.List;

public class _LongestWordInString {
    public static void main(String[] args) {
        String s = "Today is the happiest eveeeeen  day of my life by vijayakumar";
        longestStringWord(s);
        longestStringAddedArray(s);
    }


    public static void longestStringAddedArray(String str) {
        String longest = "";
        List<String> longestArrayList = new ArrayList<>();
        String exclude = str.replaceAll("!+", "");
        String[] wrd = exclude.split(" ");

        for (int i = 0; i < wrd.length; i++) {
            if (wrd[i].length() >= longest.length()) {
                longest = wrd[i];
                longestArrayList.add(wrd[i]);
            }
        }
        System.out.println("The Longest Word In the Sentence is " + longestArrayList);
    }

    public static void longestStringWord(String str) {
        String longest = "";
        String[] strArray = str.split("\\s");

        for (String s : strArray) {
            if (s.length() >= longest.length()) {
                longest = s;
            }
        }
        System.out.println(longest);
    }
}

