package practise_java_questions.Arrays;

public class CountAllWordsString {
    public static void main(String[] args) {
        String str = "What do you mean y";
        countAllWordsString(str);
    }

    public static void countAllWordsString(String str) {
        String[] words = str.split("\\s");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*[aeouie].*")) ;
            count++;
        }
        System.out.println("The Amount Of The Vowels is: " + count);
    }
}
