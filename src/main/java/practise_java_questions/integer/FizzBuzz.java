package practise_java_questions.integer;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(90);

    }

    public static void fizzBuzz(int bound){
        for (int i = 0; i <= bound; i++) {
            if (i%5==0 && i%3 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
