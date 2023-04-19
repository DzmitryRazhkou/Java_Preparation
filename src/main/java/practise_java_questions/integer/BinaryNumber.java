package practise_java_questions.integer;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");

        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("The Binary Representation of " + decimal + " is " + binary);
    }
}
