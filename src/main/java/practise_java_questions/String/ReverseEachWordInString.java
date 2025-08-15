package practise_java_questions.String;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "XCUITest Cypress Selenium";

        String reverseStringBuilder = reverseEachWordStringBuilder(str);
        System.out.println("Reverse String Using StringBuider: " + reverseStringBuilder);

        System.out.println(" =====> __________ <===== ");

        String reverseString = reverseEachWordString(str);
        System.out.println("Reverse String Using String: " + reverseString);
    }

    private static String reverseEachWordStringBuilder(String input) {
        StringBuilder reversedString = new StringBuilder();
        String[] wordArray = input.split(" ");

        for (String w : wordArray) {
            StringBuilder reversedWord = new StringBuilder(w);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }

    private static String reverseEachWordString(String input) {
        String reversedString = "";
        String[] wordArray = input.split(" ");

        for (String s : wordArray) {
            String reversedWord = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversedWord += s.charAt(i);
            }
            reversedString += reversedWord + " ";
        }
        return reversedString;
    }
}
