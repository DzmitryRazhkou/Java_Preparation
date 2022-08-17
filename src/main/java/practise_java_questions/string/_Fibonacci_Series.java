package practise_java_questions.string;

public class _Fibonacci_Series {
    public static void main(String[] args) {
//        0 1 1 2 3 5 8 13 21 34 ......

        int t1 = 0;
        int t2 = 1;
        int num = 12;

        for (int i = 1; i <= num; i++) {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
