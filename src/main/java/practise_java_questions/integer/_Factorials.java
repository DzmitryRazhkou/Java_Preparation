package practise_java_questions.integer;

public class _Factorials {
    public static void main(String[] args) {
        int number = 12;
        int result = factorialNumbers(number);
        int resultRecursion = factorialRecursion(number);

        System.out.println("The _Factorials Number is: " + result);
        System.out.println("The Recursion _Factorials is: " + resultRecursion);
    }

    public static int factorialNumbers(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorialRecursion(int num) {
        if (num >= 1) {
            return num * factorialRecursion(num - 1);
        } else {
            return 1;
        }
    }
}
