package practise_java_questions.tricky;

public class Nan {

    public static void main (String[] args) {

//        What is Nan - Not a Number?
//        How is Nan defined in different languages?
//        Java, C, C++, Rudy, Python, JS

        System.out.println(2.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);

        System.out.println("___________");

        double nan = 2.1 % 0;
        System.out.println((2.1 % 0) == nan);
    }
}
