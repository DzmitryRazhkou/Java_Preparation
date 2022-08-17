package preparation.integer;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Print: ");
        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
