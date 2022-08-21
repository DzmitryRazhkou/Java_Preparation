package practise_java_questions.integer;

public class Factorial_Recursion {
    public static void main(String[] args) {
        int num = 3;
        int multiply = multiplyNum(num);
        System.out.println(multiply);

    }

    public static int multiplyNum(int num) {
        if (num >= 1) {
            return num * multiplyNum(num - 1);
        } else {
            return 1;
        }
    }
}
