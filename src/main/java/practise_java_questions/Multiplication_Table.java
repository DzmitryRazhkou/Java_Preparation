package practise_java_questions;

public class Multiplication_Table {
    public static void main(String[] args) {
        printMultiplication(7);

    }
    public static void printMultiplication(int initial_number){
        for (int i = 1; i<=10; i++) {
            System.out.println(initial_number+ "x" +i+ " = " +initial_number*i);
        }
    }
}
