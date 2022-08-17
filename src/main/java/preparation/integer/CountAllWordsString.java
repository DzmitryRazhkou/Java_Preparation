package preparation.integer;

public class CountAllWordsString {
    public static void main(String[] args) {
        String str = "What do you mean y";
        String[]words = str.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*[aeoui].*"))
            count++;
        }
        System.out.println(count);
    }
}
