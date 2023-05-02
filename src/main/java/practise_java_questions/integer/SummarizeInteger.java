package practise_java_questions.integer;

public class SummarizeInteger {
    public static void main(String[] args) {
        summarize(34559);
    }

    public static void summarize(int number) {
        int sum = 0;

        while (number > 1) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
