package practise_java_questions.Numbers;

public class FibonacciSeriesNumber {
    public static void main(String[] args) {
        fibonacciSeries(12);
    }

    public static void fibonacciSeries(int number) {
        printFibonacciNumbers(29);
    }

    private static void printFibonacciNumbers(int number) {
        int s1 = 0;
        int s2 = 1;
        int sum;

        for (int i = 1; i < number; i++) {
            System.out.println(s1);

            sum = s1 + s2;
            s1 = s2;
            s2 = sum;
        }
    }
}
