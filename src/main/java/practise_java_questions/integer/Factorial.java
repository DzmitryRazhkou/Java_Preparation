package practise_java_questions.integer;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(12));
        getFactorial(12);
    }

    public static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void getFactorial(int x) {
        int fact = 1;

        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + x + " is: " + fact);
    }
}
