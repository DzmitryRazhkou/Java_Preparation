package practise_java_questions.Numbers;

public class SumDigitsUntilSingle {
    public static void main(String[] args) {
        int num = 9875;
        int result = sumUntilSingleDigit(num);
        System.out.println("Final single digit sum: " + result);
    }

    public static int sumUntilSingleDigit(int number) {
        while (number >= 10) { // repeat until it's a single digit
            int sum = 0;
            while (number > 0) {
                sum += number % 10; // add last digit
                number /= 10;       // remove last digit
            }
            number = sum; // update number to the sum
        }
        return number;
    }
}
