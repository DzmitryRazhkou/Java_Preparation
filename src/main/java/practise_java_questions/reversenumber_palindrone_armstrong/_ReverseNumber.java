package practise_java_questions.reversenumber_palindrone_armstrong;

public class _ReverseNumber {
    public static void main(String[] args) {
        int num = 457;
        int rev = 0;

        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num/10;
        }
        System.out.println("Reversed: " +rev);
    }
}
