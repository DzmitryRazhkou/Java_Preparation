package practise_java_questions;

public class _NaturalNumberSumRecursion {
    public static void main(String[] args) {

        int num = 5;
        int sum = addNum(num);
        System.out.println("Sum is: " +sum);
    }

    public static int addNum(int num){
        if (num != 0) {
            return num + addNum(num - 1);
        } else{
            return num;
        }
    }
}
