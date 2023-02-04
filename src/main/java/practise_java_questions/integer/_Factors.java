package practise_java_questions.integer;

public class _Factors {
    public static void main(String[] args) {

        int number = 75;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
