package practise_java_questions.arrays;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int numbersOFDices = 5;
        int[] dices = throwDices(numbersOFDices);
        int moves = getMoves(dices);
        System.out.println("Result: " + moves);
    }

    private static int getMoves(int[] dices) {
        int moves = 0;
        for (int dice : dices) {
            if (dice == 1) {
                moves += 2;
                continue;
            }
            if (dice == 6) {;
                continue;
            }

            moves++;
        }
        return moves;
    }


    private static int[] throwDices(int numbersOFDices) {
        int[] dices = new int[numbersOFDices];
        Random random = new Random();
        for (int i = 0; i < numbersOFDices; i++) {
            dices[i] = random.nextInt(6) + 1;
            System.out.println(dices[i]);

        }
        return dices;
    }
}

