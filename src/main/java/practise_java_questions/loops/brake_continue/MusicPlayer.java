package practise_java_questions.loops.brake_continue;

import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean RepeatButtonOn = true;

        while (RepeatButtonOn) {
            System.out.println("Repeat Song");
            System.out.println("Du you want repeat?");
            String userInput = sc.next();
            if (userInput.equals("No"));
            RepeatButtonOn = false;
        }
        System.out.println("Next Song");
    }



}
