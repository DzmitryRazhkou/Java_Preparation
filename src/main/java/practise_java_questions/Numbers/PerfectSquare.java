package practise_java_questions.Numbers;

public class PerfectSquare {
    public static void main(String[] args) {
        int number = 9;

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

    }

    private static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
