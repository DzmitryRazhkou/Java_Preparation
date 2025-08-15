package practise_java_questions.Numbers;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter Third number: ");
        double num3 = sc.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Number are increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Number are decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
