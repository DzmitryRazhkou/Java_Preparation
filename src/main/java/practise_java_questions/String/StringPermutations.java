package practise_java_questions.String;

public class StringPermutations {
    public static void main(String[] args) {
        permute("Fa", "");
    }

    private static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                permute(remaining, prefix + currentChar);
            }
        }
    }
}
