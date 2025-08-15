package practise_java_questions.Numbers;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(249);

    }

    public static void fizzBuzz(int bound){
        for (int i = 0; i < bound; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
