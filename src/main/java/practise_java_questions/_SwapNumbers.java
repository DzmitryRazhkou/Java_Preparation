package practise_java_questions;

public class _SwapNumbers {
    public static void swapNumbers(int a, int b){
        b = b + a; // now b is sum of both the numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a; // (b + a) - b = a (b is swapped)
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);
        System.out.println("a is b, b is a" +a+ " " +b); // a is 10, b is 20);
    }
}
