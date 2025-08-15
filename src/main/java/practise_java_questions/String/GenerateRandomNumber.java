package practise_java_questions.String;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        generateRandom(100);
    }

    public static void generateRandom(int number) {

        // Create a Random object
        Random rd = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rd.nextInt(number) + 1;

        // Print the random number to the console
        System.out.println("Random Numbers is: " + randomNumber);
    }
}

