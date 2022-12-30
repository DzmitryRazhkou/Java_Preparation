package practise_java_questions.integer;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(80);

    }

    public static void fizzBuzz(int bound){
            if (bound % 5 == 0 && bound % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (bound % 3 == 0) {
                System.out.println("Fizz");
            } else if (bound % 5 == 0) {
                System.out.println("Buzz");
            }
        System.out.println(bound);
        }
}
