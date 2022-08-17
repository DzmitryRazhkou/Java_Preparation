package practise_java_questions.reversenumber_palindrone_armstrong;

public class _Palindrome {
    public static void main(String[] args) {

//        121 = 121 (>>>> = <<<<<) 1551 = 1551

        int rev = 0;
        int num = 121;

        int act = num;

        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }

        if (act == rev) {
            System.out.println(act + " is Palindrome");
        } else {
            System.out.println(act + " isn't Palindrome");
        }

    }
}
