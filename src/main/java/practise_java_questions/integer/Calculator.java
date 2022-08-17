package practise_java_questions.integer;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter number");

        double first = rd.nextDouble();
        double second = rd.nextDouble();

        System.out.println("Please enter operator: (+,-, *, /)");
        char op = rd.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.println("Please enter a correct operator");
                break;
        }

        System.out.println(result);
    }
}
