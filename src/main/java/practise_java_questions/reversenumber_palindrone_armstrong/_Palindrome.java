package practise_java_questions.reversenumber_palindrone_armstrong;

public class _Palindrome {
    public static void main(String[] args) {

//        121 = 121 (>>>> = <<<<<) 1551 = 1551

        palindrome(1551);

    }

    public static void palindrome(int num) {
        int reverseNumber = 0;
        int temporary;
        int reminder;

        temporary = num;

        while (num != 0) {
            reminder = num % 10;
            num = num / 10;
            reverseNumber = reverseNumber * 10 + reminder;
        }

        if (reverseNumber == temporary) {
            System.out.println(reverseNumber + " is Palindrome");
        } else {
            System.out.println(reverseNumber + " isn't Palindrome");
        }

    }
}
