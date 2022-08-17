package practise_java_questions.integer;

import java.util.Scanner;

public class ScannerDice {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = sc.nextInt();

        if(number > 6){
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
}
