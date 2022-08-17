package practise_java_questions;

public class Min_Value {
    public static void main(String[] args) {


//        What is the value of double MIN VALUE?
//        Which one is bigger -> Double MIN_VALUE or 0.0d?
//        Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?

        System.out.println(Double.MIN_VALUE);  // positive number

        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

    }
}
