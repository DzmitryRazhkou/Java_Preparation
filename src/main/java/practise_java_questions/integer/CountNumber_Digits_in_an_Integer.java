package practise_java_questions.integer;

public class CountNumber_Digits_in_an_Integer {
    public static void main(String[] args) {
        countDigitsInteger(124444);
    }

    public static void countDigitsInteger(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Amount of digits: " + count);
    }
}
