package practise_java_questions.integer;

public class _PowerNumber {
    public static void main(String[] args) {
        int num_base = 2;
        int exponent = 5;

        long res = 1;
        while (exponent != 0) {
            res*=num_base;
            --exponent;
        }

        System.out.println(res);

        System.out.println("__________");

        System.out.println(Math.pow(res, num_base));

    }
}
