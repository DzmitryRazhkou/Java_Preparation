package practise_java_questions.integer;

import java.util.Scanner;

public class LeapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an Year");
        int year = sc.nextInt();
        boolean a = (year%4 == 0);
        boolean b = (year%100 != 0);
        boolean c = (year%100 == 0) && (year%400 == 0);

        if (a & (b || c)){
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }
    }
}
