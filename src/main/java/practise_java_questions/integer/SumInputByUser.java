package practise_java_questions.integer;

import java.util.Scanner;

public class SumInputByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: !");
        int s = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < s; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
