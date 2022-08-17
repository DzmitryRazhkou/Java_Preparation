package practise_java_questions;

import java.util.Scanner;

public class Even_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz put a numb: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num+ " - Even number");
        }
        else {
            System.out.println(num+ " - Not");
        }
    }
}
