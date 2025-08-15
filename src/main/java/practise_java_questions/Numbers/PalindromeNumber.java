package practise_java_questions.Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindromeNumber(121);
    }

    private static void isPalindromeNumber(int digit) {
        int result = 0;
        int originNumber = digit;

        while (digit != 0) {
            int reminder = digit % 10;
            result = result * 10 + reminder;
            digit /= 10;
        }
        if (result == originNumber) {
            System.out.println("The " + result + " is Palindrome Number!!!");
        } else {
            System.out.println("The " + result + " is Not Palindrome Number!!!");
        }
    }
}
