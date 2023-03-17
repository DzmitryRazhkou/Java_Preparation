package practise_java_questions.integer.prime;

public class _PrimeNumber {
    public static void main(String[] args) {

        int n = 31;
        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " isn't Prime");
        }
    }
}
