package practise_java_questions.string;

public class _LongestWordInString {
    public static void main(String[] args) {
        String s = "Today is the happiest day of my life by vijayakumar";
        String[] word = s.split(" ");
        String max = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= max.length()) {
                max = word[i];
            }
        }
        System.out.println(max);
    }
}

