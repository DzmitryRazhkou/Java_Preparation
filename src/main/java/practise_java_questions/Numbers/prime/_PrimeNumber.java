package practise_java_questions.Numbers.prime;

import java.util.Scanner;

public class _PrimeNumber {
    public static void main(String[] args) {
        primeNumber(10);

//
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type any number. ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("'" + number + "' Is Prime Number. ");
        } else {
            System.out.println("'" + number + "' Is Not Prime Number. ");
        }
        sc.close();
    }

    //    Method #1:
    public static void primeNumber(int number) {
        boolean flag = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("'" + number + "' Is Prime Number. ");
        } else {
            System.out.println("'" + number + "' Is Not Prime Number. ");
        }
    }

    //    Method #2:
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
