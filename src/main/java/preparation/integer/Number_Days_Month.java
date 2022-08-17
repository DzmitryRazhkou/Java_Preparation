package preparation.integer;

import java.util.Scanner;

public class Number_Days_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDaysInMounts = 0;
        String MonthName = "Unknown";

        System.out.println("Input a Month Number");
        int month = sc.nextInt();

        System.out.println("Input a Year");
        int year = sc.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                numberOfDaysInMounts = 31;
                break;

            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) || ((year % 100 != 0))))
                    numberOfDaysInMounts = 29;
                else {
                    numberOfDaysInMounts = 28;
                }
                break;

            case 3:
                MonthName = "March";
                numberOfDaysInMounts = 31;
                break;
        }
        System.out.println(MonthName + " " +year+ " has " +numberOfDaysInMounts+ " days");
    }
}
