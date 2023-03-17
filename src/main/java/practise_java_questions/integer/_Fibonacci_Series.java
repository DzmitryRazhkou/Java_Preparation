package practise_java_questions.integer;

public class _Fibonacci_Series {
    public static void main(String[] args) {
        fibonacciSeries(12);
    }

    public static void fibonacciSeries(int number) {

        //        0 1 1 2 3 5 8 13 21 34 ......

        int s1 = 0;
        int s2 = 1;
        int sum;

        for (int i = 1; i <= number; i++) {
            System.out.println(s1);
            sum = s1 + s2;
            s1 = s2;
            s2 = sum;
        }
    }
}
