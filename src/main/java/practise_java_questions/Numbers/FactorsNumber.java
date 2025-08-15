package practise_java_questions.Numbers;

public class FactorsNumber {
    public static void main(String[] args) {
        int number = 100;
        printFactorNumbers(number);
    }

    private static void printFactorNumbers(int digit) {
        for (int i = 1; i <= digit; i++) {
            if (digit % i == 0) {
                System.out.printf(i + " ");
            }
        }
    }
}