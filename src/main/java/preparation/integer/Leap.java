package preparation.integer;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print: ");
        int year = sc.nextInt();
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c)){
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }

    }
}
