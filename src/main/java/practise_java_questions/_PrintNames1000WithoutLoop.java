package practise_java_questions;

public class _PrintNames1000WithoutLoop {
    public static void main(String[] args) {
        String name = "Dzmitry";
        String s = "i";
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");
        s = s.replaceAll("i", "iiiiiiiiii");

        s = s.replaceAll("i", name+ "\n");
        System.out.println(s);
    }
}
