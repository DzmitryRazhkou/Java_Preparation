package practise_java_questions.Numbers;

public class SumDigitsInNumber {
    public static void main(String[] args) {
        summarize(123);
    }

    public static void summarize(int number) {
        int sum = 0;

        while (number != 0) {
            int reminder = number % 10;
            sum = sum + reminder;
            number /= 10;
        }
        System.out.println(sum);
    }
}
