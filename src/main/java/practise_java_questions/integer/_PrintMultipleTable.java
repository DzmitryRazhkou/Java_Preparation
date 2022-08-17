package practise_java_questions.integer;

import java.util.Scanner;

public class _PrintMultipleTable {
    public static void main(String[] args) {
        System.out.println("Enter first number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(number+ " x " + i + " = " + number * i);
        }
    }
}
