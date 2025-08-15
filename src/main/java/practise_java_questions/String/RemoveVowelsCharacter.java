package practise_java_questions.String;

public class RemoveVowelsCharacter {
    public static void main(String[] args) {
        String inputString = "Hello, this is a sample string!";
        String resultString = removeVowels(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing vowels: " + resultString);
    }

    private static String removeVowels(String input) {
        StringBuilder sb = new StringBuilder();
        if (input == null || input.isEmpty()) {
            return input;
        }

        for (char s : input.toCharArray()) {
            if (!isVowel(s)) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
