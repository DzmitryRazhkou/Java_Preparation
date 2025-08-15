package practise_java_questions.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Levic Meow";

        reversedString(str);
        System.out.println("\n-----------");

        reversedStringBuilder(str);
        System.out.println("\n-----------");

        reversedStringArray(str);
        System.out.println("\n-----------");

        reversedStringUsingChars(str);
        System.out.println("\n-----------");
    }

    private static void reversedString(String input) {
        String[] wordArray = input.split("\\s+");
        String reversedWord = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedWord += input.charAt(i);
        }
        System.out.println("The Reversed String Using StringBuilder is: " + reversedWord);
    }

    private static void reversedStringBuilder(String input) {
        StringBuilder reversed = new StringBuilder(input);
        System.out.println("The Reversed String Using StringBuilder is: " + reversed.reverse().toString().trim());
    }

    private static void reversedStringArray(String str) {
        char[] charArray = str.toCharArray();

        // Reverse the entire character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the reversed character array back to a string
        System.out.println("The Reversed String Using Array is:  " + new String(charArray));
    }

    private static void reversedStringUsingChars(String str) {
        char[] charArray = str.toCharArray();

        System.out.println("The Reversed Using 'ToCharArray()' is: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}

