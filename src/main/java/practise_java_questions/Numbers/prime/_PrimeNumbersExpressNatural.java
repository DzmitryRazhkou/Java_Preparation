package practise_java_questions.Numbers.prime;

public class _PrimeNumbersExpressNatural {
    public static void main(String[] args) {

        int num = 15;
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {
            if (checkPrimeNumber(i)) {
                if (checkPrimeNumber(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println(num + " can not be expressed as the Sum of Two Prime Numbers");
        }

        System.out.println("_______________");

        boolean res = expressAsSumOfTwoPrimes(15);
        System.out.println(res);
    }

    public static boolean checkPrimeNumber(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //    1 Step
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean expressAsSumOfTwoPrimes(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return true;
            }
        }
        return false;
    }
}
