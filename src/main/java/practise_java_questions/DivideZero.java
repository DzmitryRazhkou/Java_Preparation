package practise_java_questions;

public class DivideZero {
    public static void main(String[] args) {

//        What will be the output when you put
//        Number = Integer, Double/ Float

//        System.out.println(9/0);   // ArithmeticException
        System.out.println("______");
        System.out.println(9.0/0);   // Infinity
        System.out.println("______");
        System.out.println(10/0.0);   // Infinity
        System.out.println("______");
        System.out.println(19.999d/0);   // Infinity
        System.out.println("______");
        System.out.println(12.33f/0);   // Infinity
        System.out.println("______");


//        Exception

        System.out.println(0.0/0);   //  Nan
    }
}
