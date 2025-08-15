package practise_java_questions.String;

import java.util.Scanner;

public class NumberOfWeekDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");

        int day = in.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        }
    }
}
