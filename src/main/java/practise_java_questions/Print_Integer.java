package practise_java_questions;

import java.util.Scanner;

public class Print_Integer
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        System.out.println("The number has been entered " +num);
    }
}
