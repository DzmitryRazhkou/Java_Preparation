package practise_java_questions.integer;

public class _SummarizeNumbers {
    public static void main(String[] args) {
        int sum = recursionAddNumber(5);
        System.out.println("Sum Thru Recursion is: " + sum);
        summarizeNumbersThruForLoop(5);
        summarizeNumbersThruWhileLoop(5);
    }

    public static int recursionAddNumber(int number) {
        if (number != 0) {
            return number + recursionAddNumber(number - 1);
        } else {
            return number;
        }
    }
    public static void summarizeNumbersThruForLoop(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum Thru For Loop is: " +sum);
    }
    public static void summarizeNumbersThruWhileLoop(int number) {
        int sum = 0;
        int z = 0;

        while (z<=number){
            sum+=z;
            z++;
        }
        System.out.println("Sum Thru Loop While is: " +sum);
    }
}
