package practise_java_questions.String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Youoy";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        int length = str.length() - 1;

        for (int i = length; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return (str.toLowerCase().equals(reversed.toLowerCase()));
    }
}
