package practise_java_questions.Numbers;

public class Factorials {
    public static void main(String[] args) {
        int number = 29;
        long result = factorialNumbers(number);
        long factorial = factorialRecursion(number);

        System.out.println("The Factorial Using Recursion Of " + number + " is: " + factorial);
        System.out.println("The Factorial Using ForI Of " + number + " is: " + result);
    }

    public static long factorialNumbers(int num) {
        long factorial = 1;
        if (num == 0 || num == 1) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialRecursion(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        } else {
            return digit * factorialRecursion(digit - 1);
        }
    }
}
