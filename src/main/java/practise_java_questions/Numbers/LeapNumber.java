package practise_java_questions.Numbers;

import java.util.Scanner;

public class LeapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an Year");

        int year = sc.nextInt();
        boolean a = (year % 4 == 0);
        boolean b = (year % 100 != 0);
        boolean c = (year % 100 == 0) && (year % 400 == 0);

        if (a & (b || c)) {
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }

        isLeap(2000);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void isLeap(int year) {
        if (isLeapYear(year)) {
            System.out.println("It's a leap year: " + year);
        } else {
            System.out.println("It's not a leap year: " + year);
        }
    }
}