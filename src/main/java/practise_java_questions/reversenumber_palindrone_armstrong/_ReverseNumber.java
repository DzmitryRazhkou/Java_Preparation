package practise_java_questions.reversenumber_palindrone_armstrong;

public class _ReverseNumber {
    public static void main(String[] args) {
        int number = 457;
        int reverseNumber = 0;
        int reminder;

        while (number != 0) {
            reminder = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + reminder;
        }
        System.out.println("Reversed: " + reverseNumber);
    }
}
