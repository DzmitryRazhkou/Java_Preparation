package practise_java_questions.Numbers;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        countDigitsInteger(124444);
    }

    public static void countDigitsInteger(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("The Count Of The Digits is: " + count);
    }
}
