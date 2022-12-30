package temp;

public class TestExec {
    public static void main(String[] args) {
        FizzBuzz(2);
    }

    public static void FizzBuzz(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Else");
        }
        System.out.println(n);
    }
}

