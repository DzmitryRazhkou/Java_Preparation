package preparation.integer;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int number){
        int fact = 1;
        for (int l = 1; l <= number; l++) {
            fact = fact * l;
        }
        return fact;
    }
}
