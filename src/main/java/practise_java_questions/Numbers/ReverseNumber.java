package practise_java_questions.Numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        reversedNumber(1896543);
    }

    private static void reversedNumber(int number) {
        int result = 0;

        while (number != 0) {
            int reminder = number % 10;
            result = result * 10 + reminder;
            number /= 10;
        }
        System.out.println("The Reversed Number Is: " + result);
    }
}
