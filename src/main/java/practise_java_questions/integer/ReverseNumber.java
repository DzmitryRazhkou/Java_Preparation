package practise_java_questions.integer;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print:");
        int numb = sc.nextInt();
        int rev = 0;
        int n;

        while (numb>0) {
            n = numb % 10;
            rev = rev * 10 + n;
            numb = numb / 10;
        }

        System.out.println(rev);
    }
}
