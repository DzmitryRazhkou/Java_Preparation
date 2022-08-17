package practise_java_questions;

public class Expressed_as_Sum_of_Two_Prime_Numbers {
    public static void main(String[] args) {

        int num = 13;
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
}
