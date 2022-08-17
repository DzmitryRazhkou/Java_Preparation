package practise_java_questions.string;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class _GenerateRandomNumber {
    public static void main(String[] args) {

//        1. Random:

        Random random = new Random();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Random int: " + random.nextInt());
        }
        System.out.println("---------");

//        2. Math.random():

        for (int i = 0; i <5; i++) {
            System.out.println(Math.random());
        }
        System.out.println("---------");

//        3. ThreadLocalRandom:

        for (int i = 0; i <5; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
        }
        System.out.println("----range-----");

//        4. Range:

        for (int i = 0; i <5; i++) {
//            System.out.println(random.nextInt(100));   // tp 100
//            System.out.println((double)(Math.random()*5));
            System.out.println(ThreadLocalRandom.current().nextInt(1,35));
        }



    }
}
