package practise_java_questions.String;

public class StringReversePalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Oto"));
    }

    public static String reversedString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String cleared = str.replaceAll("\\s+", "").toLowerCase();
        return cleared.equals(reversedString(cleared));
    }
}
