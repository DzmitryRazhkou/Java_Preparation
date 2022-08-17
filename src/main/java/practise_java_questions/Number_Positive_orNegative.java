package practise_java_questions;

public class Number_Positive_orNegative {
    public static void main(String[] args) {
        double numb = -0;

        if (numb < 0) {
            System.out.println(numb + " is Negative");
        } else if (numb > 0)
            System.out.println(numb + " is Positiive");
        else {
            System.out.println(numb + " is zero");
        }
    }
}
