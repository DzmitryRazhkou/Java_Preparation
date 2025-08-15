package practise_java_questions.Numbers.prime;

public class _PrimePrintNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(34);
        System.out.println("---_____----");
        printPrimes(34);
    }

    //    Method #1:
    public static void printPrimeNumbers(int number) {
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    //    Method #2:
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
